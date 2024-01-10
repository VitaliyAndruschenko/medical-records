package com.example.Medicine.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/doctorError").setViewName("doctorError");
        registry.addViewController("/registrationNurse").setViewName("registrationNurse");
        registry.addViewController("/registrationDoctor").setViewName("registrationDoctor");
        /*главная*/
    }
}
