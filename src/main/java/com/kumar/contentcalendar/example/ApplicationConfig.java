package com.kumar.contentcalendar.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean("myBean")
    public MyFirstClass myFirstClass(){
        return new MyFirstClass();
    }
}