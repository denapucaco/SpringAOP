package com.sparsh.learning.spring.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sparsh.learning.spring.service.ShapeService;

/**
 * @author prashant.swamy
 *
 */
public class TestClass {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = context.getBean("shapeService", ShapeService.class);

        System.out.println(shapeService.getCircle().getName());

        ((ConfigurableApplicationContext) context).close();
    }
}
