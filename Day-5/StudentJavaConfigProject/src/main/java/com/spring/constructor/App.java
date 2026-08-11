package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ConstructorConfig;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConstructorConfig.class);

        Student student = context.getBean(Student.class);

        student.display();
    }
}