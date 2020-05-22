package com.peigong.patterns.chapter30.abstractfactory_vs_builder.abstract_factory;

/**
 * @author: lilei
 * @create: 2020-05-22 15:10
 **/
public abstract class Benz implements Car {

    private static final String BENZ = "BENZ";

    @Override
    public String getBand() {
        return BENZ;
    }


}
