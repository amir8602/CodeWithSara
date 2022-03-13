package com.company;

import static org.junit.Assert.assertTrue;

import com.company.spring.context.StudentPrototype;
import com.company.spring.context.StudentSingleton;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");



    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void checkSingletonBean(){
        StudentSingleton singleton = (StudentSingleton) context.getBean("singleton");
        StudentSingleton singleton1 = (StudentSingleton) context.getBean("singleton");
        assertTrue(singleton==singleton1);
    }

    @Test
    public void checkPrototypeBean(){
        StudentPrototype prototype = (StudentPrototype) context.getBean("prototype");
        StudentPrototype prototype1 = (StudentPrototype) context.getBean("prototype");
        assertTrue(prototype!=prototype1);
    }

}
