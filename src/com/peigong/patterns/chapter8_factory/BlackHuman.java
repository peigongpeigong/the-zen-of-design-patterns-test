package com.peigong.patterns.chapter8_factory;

/**
 * @author: lilei
 * @create: 2020-05-17 14:52
 **/
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("Black");
    }

    @Override
    public void talk() {
        System.out.println("I'm Black");
    }
}
