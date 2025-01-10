package com.example.yetanothersite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YetAnotherSiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(YetAnotherSiteApplication.class, args);
    }
}
