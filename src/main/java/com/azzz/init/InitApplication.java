package com.azzz.init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.azzz.init.mapper")
public class InitApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitApplication.class, args);
    }

}
