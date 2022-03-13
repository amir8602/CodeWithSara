package com.company.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentPrototype prototype = (StudentPrototype) context.getBean("prototype");
        StudentSingleton singleton = (StudentSingleton) context.getBean("singleton");



    }
}
