package com.peigong.patterns.chapter30.factorymethod_vs_builder.factory_method;

/**
 * @author: lilei
 * @create: 2020-05-22 13:55
 **/
public class ChildSuperMan implements SuperMan {
    @Override
    public void specialTalent() {
        System.out.println("小超人刀枪不入，速度奇快");
    }
}
