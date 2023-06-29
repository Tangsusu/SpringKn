package com.susu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunch
 * @Description
 * @date 2023/6/28 16:22
 **/

public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("------------------停断1-----------------");

    }
}
