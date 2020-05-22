package com.peigong.patterns.chapter30.factorymethod_vs_builder.builder;

/**
 * @author: lilei
 * @create: 2020-05-22 14:07
 **/
public class Director {

    public static SuperMan buildAdult() {
        return new AdultSuperManBuilder().build();
    }

    public static SuperMan buildChild() {
        return new ChildSuperManBuilder().build();
    }

}
