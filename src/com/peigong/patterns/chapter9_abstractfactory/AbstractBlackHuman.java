package com.peigong.patterns.chapter9_abstractfactory;

/**
 * @author: lilei
 * @create: 2020-05-17 16:19
 **/
public abstract class AbstractBlackHuman implements Human {

    @Override
    public void color() {
        System.out.println("Black");
    }

    @Override
    public void talk() {
        System.out.println("I'm Black");
    }
}
