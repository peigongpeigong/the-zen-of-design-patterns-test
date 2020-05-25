package com.peigong.patterns.chapter33.wrapping.decorator;

/**
 * @author: lilei
 * @create: 2020-05-25 09:43
 **/
public abstract class ActDecorator implements Superstar {

    private Superstar superstar;

    public ActDecorator(Superstar superstar) {
        this.superstar = superstar;
    }

    @Override
    public void act() {
        superstar.act();
    }
}
