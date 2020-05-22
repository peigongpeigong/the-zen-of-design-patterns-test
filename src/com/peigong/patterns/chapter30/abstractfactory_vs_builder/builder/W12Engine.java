package com.peigong.patterns.chapter30.abstractfactory_vs_builder.builder;

/**
 * @author: lilei
 * @create: 2020-05-22 15:21
 **/
public class W12Engine implements Engine {
    @Override
    public void engineStart() {
        System.out.println("Twins V6 Running");
    }
}
