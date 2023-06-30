package com.susu.Bean;

import org.springframework.stereotype.Component;

/**
 * @author sunch
 * @Description
 * @date 2023/6/29 19:24
 **/
@Component
public class Tomato {
    String color;
    String taste;

    public Tomato(){

    }
    public Tomato(String color, String taste) {
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
}
