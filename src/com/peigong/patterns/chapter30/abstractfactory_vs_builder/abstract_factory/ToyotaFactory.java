package com.peigong.patterns.chapter30.abstractfactory_vs_builder.abstract_factory;

/**
 * @author: lilei
 * @create: 2020-05-22 15:14
 **/
public class ToyotaFactory implements CarFactory {
    @Override
    public Car buildMPV() {
        return new Alphard();
    }

    @Override
    public Car buildSedan() {
        return new Reiz();
    }
}
