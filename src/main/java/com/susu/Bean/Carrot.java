package com.susu.Bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author sunch
 * @Description
 * @date 2023/6/29 19:25
 **/
//多例对象怎么注入
@Component(value = "carrot")
@Scope(value = "singleton")
public class Carrot {
    String color;
    String taste;

    public Carrot(){

    }

    public Carrot(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @PostConstruct
    public void init(){
        System.out.println("Carrot------>Ex->init()");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Carrot------>Ex->destroy()");
    }
}
