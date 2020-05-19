package com.peigong.patterns.chapter18_strategy;

/**
 * @author: lilei
 * @create: 2020-05-19 15:08
 **/
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operate(){
        strategy.operate();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
