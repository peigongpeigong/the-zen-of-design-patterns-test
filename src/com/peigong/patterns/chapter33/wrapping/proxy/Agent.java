package com.peigong.patterns.chapter33.wrapping.proxy;

/**
 * @author: lilei
 * @create: 2020-05-25 09:40
 **/
public class Agent implements Superstar {

    private Superstar superstar;

    public Agent(Superstar superstar) {
        this.superstar = superstar;
    }

    @Override
    public void sign() {
        superstar.sign();
    }
}
