package com.example.SimpleSpringBoot.config;

import com.example.SimpleSpringBoot.beans.Names;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Names names(){
        return new Names();
    }

    /*@Bean
    public MyDaoImpl getDAO() {
        return new MyDaoImpl();
    }*/
}
