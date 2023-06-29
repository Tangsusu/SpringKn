package com.susu.Bean;

/**
 * @author sunch
 * @Description
 * @date 2023/6/28 17:52
 **/

public class FruitBox {
    Apple apple;
    Pear pear;

    public FruitBox(Apple apple, Pear pear) {
        this.apple = apple;
        this.pear = pear;
    }
    public FruitBox(Apple apple, Pear pear,String par1,String par2) {
        this.apple = apple;
        this.pear = pear;
    }

    public FruitBox() {

    }


    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public Pear getPear() {
        return pear;
    }

    public void setPear(Pear pear) {
        this.pear = pear;
    }
}
