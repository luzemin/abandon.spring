package com.netlovespring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.netlovespring.mapper")
public class NetLoveSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetLoveSpringApplication.class, args);
    }
}