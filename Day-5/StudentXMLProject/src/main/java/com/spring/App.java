package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Student;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        // Constructor Injection
        
        Student student1 = context.getBean("studentConstructor", Student.class);
        student1.display();

        System.out.println();

        // Setter Injection
        
        Student student2 = context.getBean("studentSetter", Student.class);
        student2.display();
    }
}