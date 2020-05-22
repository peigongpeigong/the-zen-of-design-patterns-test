package com.peigong.patterns.chapter32.strategy_vs_state.strategy;

/**
 * @author: lilei
 * @create: 2020-05-22 17:03
 **/
public class Client {

    public static void main(String[] args) {
        Person person = new Person();
        person.setLifeStage(new ChildrenStage());
        person.living();
        person.setLifeStage(new AdultStage());
        person.living();
    }

}
