package com.peigong.patterns.chapter33.wrapping.bridge;

/**
 * @author: lilei
 * @create: 2020-05-25 10:11
 **/
public class Actor extends Superstar {

    public Actor(Action action) {
        super(action);
    }

    @Override
    public void doSomething() {
        System.out.println("我是一个演员");
        super.doSomething();
    }
}
