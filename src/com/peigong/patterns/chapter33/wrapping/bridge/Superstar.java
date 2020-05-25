package com.peigong.patterns.chapter33.wrapping.bridge;

/**
 * @author: lilei
 * @create: 2020-05-25 10:06
 **/
public abstract class Superstar {

    private Action action;

    public Superstar(Action action) {
        this.action = action;
    }

    public void doSomething(){
        action.act();
    }

}
