package com.peigong.patterns.chapter32.strategy_vs_state.strategy;

/**
 * @author: lilei
 * @create: 2020-05-22 17:01
 **/
public class ChildrenStage implements LifeStage {
    @Override
    public void mission() {
        System.out.println("玩");
    }
}
