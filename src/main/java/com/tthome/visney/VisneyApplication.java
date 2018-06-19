package com.tthome.visney;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tthome.visney.dao")
public class VisneyApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisneyApplication.class, args);
    }
}
