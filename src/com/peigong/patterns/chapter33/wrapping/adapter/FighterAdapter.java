package com.peigong.patterns.chapter33.wrapping.adapter;

/**
 * @author: lilei
 * @create: 2020-05-25 09:54
 **/
public class FighterAdapter implements Superstar {

    private Standin standin;

    public FighterAdapter(Standin standin) {
        this.standin = standin;
    }

    @Override
    public void act() {
        standin.fight();
    }
}
