package com.peigong.patterns.chapter18_strategy;

/**
 * @author: lilei
 * @create: 2020-05-19 15:07
 **/
public class BlockEnemy implements Strategy {
    @Override
    public void operate() {
        System.out.println("孙尚香断后");
    }
}
