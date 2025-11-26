package com.dfrz.mixue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dfrz.mixue.mapper")
public class MiXueApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiXueApplication.class, args);
    }

}
