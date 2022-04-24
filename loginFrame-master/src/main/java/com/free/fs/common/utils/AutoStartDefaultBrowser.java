package com.free.fs.common.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringBootConfiguration;

/**
*  启动默认跳转页面
* */
@SpringBootConfiguration
public class AutoStartDefaultBrowser implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        try {
            Runtime.getRuntime().exec("cmd /c start http://localhost:8080/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
