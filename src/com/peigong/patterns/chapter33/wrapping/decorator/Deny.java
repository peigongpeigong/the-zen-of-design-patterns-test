package com.peigong.patterns.chapter33.wrapping.decorator;

/**
 * @author: lilei
 * @create: 2020-05-25 09:44
 **/
public class Deny extends ActDecorator {

    public Deny(Superstar superstar) {
        super(superstar);
    }

    @Override
    public void act() {
        super.act();
        System.out.println("这剧组不太行啊");
    }
}
