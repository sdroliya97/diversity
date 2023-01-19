package com.blackrock.hack21.drise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DRise {
    public static void main(String[] args) {
        System.setProperty("defaultWebServer", "https://webster.bfm.com/");
        System.setProperty("AUTH_METHOD", "SERVER");
        SpringApplication.run(DRise.class, args);
    }
}
