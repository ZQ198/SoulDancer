# 基于SpringBoot+Layui的登录注册模板

## 介绍
这是一个基于SpringBoot+Layui+Shiro+Thymeleaf的登录注册模板，登录通过邮箱账号登录，注册通过邮箱验证码注册，并用Shiro作为安全框架对密码加密，这是我目前开发时在网上找的一个模板，然后把整个完善了一下，以便供日后还需要写登录时直接稍微改改使用

注意：本来登录成功会跳转到后台首页，后台首页有退出登录，但是我没加上去，有些同学可能记住密码就自动登录了，你只要清以下浏览器Cookie缓存即可

## 数据库分享
链接：https://pan.baidu.com/s/1bMJ03iKOmDiq4kvOm2hWYw 
提取码：j5s3

## 界面展示
![登录](https://images.gitee.com/uploads/images/2021/0826/203712_686eb1f9_8169242.png "登录.png")
![注册](https://images.gitee.com/uploads/images/2021/0826/203744_592d1137_8169242.png "注册.png")
![密码找回](https://images.gitee.com/uploads/images/2021/0826/203753_1d1f41ef_8169242.png "密码找回.png")
## 配置邮箱
这里需要配置一个发送验证码的源头邮箱，我用的是qq邮箱作为源头邮箱，然后测试时把163邮箱来测试
![邮箱配置](https://images.gitee.com/uploads/images/2021/0826/204142_63c72af3_8169242.png "邮箱配置.png")

 **以qq邮箱为例，把授权码和qq邮箱账号换成你的就行** 
![输入图片说明](https://images.gitee.com/uploads/images/2021/0826/204521_f58e9e9a_8169242.png "屏幕截图.png")

