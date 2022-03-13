package com.company.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");



//        StudentPrototype prototype = (StudentPrototype) context.getBean("prototype");
//        StudentPrototype prototype1 = (StudentPrototype) context.getBean("prototype");
//        StudentPrototype prototype2 = (StudentPrototype) context.getBean("prototype");
//        StudentPrototype prototype3 = (StudentPrototype) context.getBean("prototype");
//        StudentPrototype prototype4 = (StudentPrototype) context.getBean("prototype");
//        StudentPrototype prototype5 = (StudentPrototype) context.getBean("prototype");


        StudentSingleton singleton = (StudentSingleton) context.getBean("singleton");
        StudentSingleton singleton1 = (StudentSingleton) context.getBean("singleton");
        if (singleton1==singleton)//reference
            System.out.println("HAHA");

        singleton.setName("sara");
        singleton1.setFamily("ghaderi");

        System.out.println("////////////////////////////////////////////////////////");

        System.out.println(singleton);
        System.out.println(singleton1);

        StudentSingleton singleton2 = singleton1;




//       StudentSingleton singleton1 = new StudentSingleton(25,"ahmmad","ahmmadi");
//
//
//        //object management
//
//        System.gc();
//
//
//
       System.out.println("Sara");
//

    }
}
