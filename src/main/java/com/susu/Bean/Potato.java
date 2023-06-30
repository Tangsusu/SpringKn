package com.susu.Bean;

import org.springframework.stereotype.Component;

/**
 * @author sunch
 * @Description
 * @date 2023/6/29 19:25
 **/
@Component
public class Potato {
    String color;
    String taste;

    public Potato(){

    }
    public Potato(String color, String taste) {
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
