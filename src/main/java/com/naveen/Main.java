package com.naveen;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        SpringApplication.run(Main.class,args);
    }
}