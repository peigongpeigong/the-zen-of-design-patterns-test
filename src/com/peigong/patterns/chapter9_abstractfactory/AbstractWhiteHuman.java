package com.peigong.patterns.chapter9_abstractfactory;

/**
 * @author: lilei
 * @create: 2020-05-17 16:18
 **/
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void color() {
        System.out.println("White");
    }

    @Override
    public void talk() {
        System.out.println("I'm White");
    }
}
