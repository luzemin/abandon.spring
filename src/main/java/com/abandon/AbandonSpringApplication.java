package com.abandon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.abandon.mapper")
public class AbandonSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbandonSpringApplication.class, args);
    }
}