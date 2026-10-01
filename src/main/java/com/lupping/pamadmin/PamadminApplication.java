package com.lupping.pamadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类
@SpringBootApplication
@MapperScan("com.lupping.pamadmin.mapper")
public class PamadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(PamadminApplication.class, args);
    }

}
