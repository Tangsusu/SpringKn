package com.susu;

import com.susu.Config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sunch
 * @Description
 * @date 2023/6/28 16:22
 **/

public class Application {
    public static void main(String[] args) {
        //（1）XML开发
        //ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
        //System.out.println("------------------停断1-----------------");

        //（2）XML注解开发
        //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationAnno.xml");
        //System.out.println("------------------停断2-----------------");

        //（3）注解开发
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("-----------------停断3-------------------");
    }
}
