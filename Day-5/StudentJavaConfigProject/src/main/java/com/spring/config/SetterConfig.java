package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.setter.Address;
import com.spring.setter.Student;

@Configuration
public class SetterConfig {

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Student student() {

        Student student = new Student();
        student.setAddress(address());

        return student;
    }
}