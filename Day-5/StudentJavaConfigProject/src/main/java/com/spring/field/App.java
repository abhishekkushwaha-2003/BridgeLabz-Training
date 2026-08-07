package com.spring.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.FieldConfig;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(FieldConfig.class);

        Student student = context.getBean(Student.class);

        student.display();
    }
}