package com.coding.basicutils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BasicUtilApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(BasicUtilApplication.class);
    }

    public static void main(String[] args){
        SpringApplication.run(BasicUtilApplication.class, args);
    }
}
