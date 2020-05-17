package com.peigong.patterns.chapter8_factory;

/**
 * @author: lilei
 * @create: 2020-05-17 14:53
 **/
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("White");
    }

    @Override
    public void talk() {
        System.out.println("I'm White");
    }
}
