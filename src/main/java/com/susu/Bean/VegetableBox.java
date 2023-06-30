package com.susu.Bean;

import org.springframework.stereotype.Component;

/**
 * @author sunch
 * @Description
 * @date 2023/6/29 19:28
 **/
@Component
public class VegetableBox {

    Carrot carrot;
    Potato potato;
    Tomato tomato;

    public VegetableBox(Carrot carrot, Potato potato, Tomato tomato) {
        this.carrot = carrot;
        this.potato = potato;
        this.tomato = tomato;
    }

    public Carrot getCarrot() {
        return carrot;
    }

    public void setCarrot(Carrot carrot) {
        this.carrot = carrot;
    }

    public Potato getPotato() {
        return potato;
    }

    public void setPotato(Potato potato) {
        this.potato = potato;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }
}
