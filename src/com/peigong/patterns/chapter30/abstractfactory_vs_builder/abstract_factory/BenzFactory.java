package com.peigong.patterns.chapter30.abstractfactory_vs_builder.abstract_factory;

/**
 * @author: lilei
 * @create: 2020-05-22 15:13
 **/
public class BenzFactory implements CarFactory {
    @Override
    public Car buildMPV() {
        return new R300();
    }

    @Override
    public Car buildSedan() {
        return new C200();
    }
}
