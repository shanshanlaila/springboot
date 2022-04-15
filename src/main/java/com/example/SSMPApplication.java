package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SSMPApplication {

    public static void main(String[] args) {
        //master 进行了修改
        SpringApplication.run(SSMPApplication.class, args);
    }

}
