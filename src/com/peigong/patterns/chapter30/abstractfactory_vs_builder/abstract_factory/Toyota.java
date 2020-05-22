package com.peigong.patterns.chapter30.abstractfactory_vs_builder.abstract_factory;

/**
 * @author: lilei
 * @create: 2020-05-22 15:07
 **/
public abstract class Toyota implements Car {

    private final static String TOYOTA = "丰田";

    @Override
    public String getBand() {
        return TOYOTA;
    }
}
