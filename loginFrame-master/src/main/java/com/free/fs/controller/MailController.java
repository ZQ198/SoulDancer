package com.free.fs.controller;

import com.free.fs.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
public class MailController {

    @Autowired
    private MailService mailService;

    @RequestMapping("getCheckCode")
    @ResponseBody
    public String getCheckCode(String email,HttpServletRequest request){
        String checkCode = randomCode();
        //将验证码放到session中
        request.getSession().setAttribute("checkCode",checkCode);
        String message = "您的验证码为：" + checkCode;
        try {
            mailService.sendSimpleMail(email, "注册验证码", message);
            System.out.println("发送成功");
        }catch (Exception e){
            System.out.println("发送异常");
            return "";
        }
        return checkCode;
    }

    /**
     * 随机生成4位数的验证码
     * @return String code
     */
    private String randomCode(){
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }
}
