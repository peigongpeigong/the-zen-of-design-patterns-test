package com.peigong.patterns.chapter30.abstractfactory_vs_builder.builder;

/**
 * @author: lilei
 * @create: 2020-05-22 15:20
 **/
public class V6Engine implements Engine {
    @Override
    public void engineStart() {
        System.out.println("6 Cylinders Running");
    }
}
