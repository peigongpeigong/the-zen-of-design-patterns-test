package com.peigong.patterns.chapter32.strategy_vs_state.strategy;

/**
 * @author: lilei
 * @create: 2020-05-22 17:02
 **/
public class Person {

    private LifeStage lifeStage;

    public void living() {
        lifeStage.mission();
    }

    public LifeStage getLifeStage() {
        return lifeStage;
    }

    public void setLifeStage(LifeStage lifeStage) {
        this.lifeStage = lifeStage;
    }
}
