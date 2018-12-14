package com.davidashley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Makes sure Spring initializes beans and recognizes annotations
@SpringBootApplication
public class Main {
    public static void main(String[] args){
        //Run Spring App from main class, and consider cmd line args
        SpringApplication.run(Main.class,args);
    }
}
