package com.susu.Bean;

/**
 * @author sunch
 * @Description
 * @date 2023/6/28 16:35
 **/

public class Apple {
    String color;
    String taste;

    public Apple(){

    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }

    public Apple(String color, String taste) {
        System.out.println("调用构造方法创建Bean实例");
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

    public void init(){
        System.out.println("E------->init()");
    }
    public void destroy(){
        System.out.println("E------->destroy()");
    }

    public void init2(){
        System.out.println("E------->init2()");
    }

    public void destroy2(){
        System.out.println("E------->destroy2()");
    }
}
