package com.free.fs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * free-fs
 *
 * @author zhangqi
 */
@SpringBootApplication
public class FreeFsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreeFsApplication.class, args);
    }

}
