package com.example.yetanothersite.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
@SpringBootApplication
public class YetAnotherSiteApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    private String name;
    private String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private Double price;
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        SpringApplication.run(YetAnotherSiteApplication.class, args);
    }
}
