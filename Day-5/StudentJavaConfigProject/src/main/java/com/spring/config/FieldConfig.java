package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.field.Address;
import com.spring.field.Student;

@Configuration
public class FieldConfig {

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Student student() {
        return new Student();
    }
}