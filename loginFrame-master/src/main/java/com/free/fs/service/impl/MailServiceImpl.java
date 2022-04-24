package com.free.fs.service.impl;

import com.free.fs.service.MailService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from; //发验证码源头邮箱

    @Override
    public void sendSimpleMail(String to,String title,String content) {

        System.out.println("==============");
        System.out.println(content);
        System.out.println("==============");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);//自己的邮箱，也就是源头邮箱
        message.setTo(to);//发给谁，目标邮箱
        message.setSubject(title);//主题
        message.setText(content);//收到的验证码
        mailSender.send(message);//发送
    }
}
