package com.example.sd18102;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Sd18102Application {

    public static void main(String[] args) {
        SpringApplication.run(Sd18102Application.class, args);
    }

}
