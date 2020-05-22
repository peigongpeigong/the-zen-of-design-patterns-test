package com.peigong.patterns.chapter30.factorymethod_vs_builder.factory_method;

/**
 * @author: lilei
 * @create: 2020-05-22 13:55
 **/
public class SuperManFactory {

    public static SuperMan createSuperMan(String type) {
        if ("adult".equals(type)) {
            return new AdultSuperMan();
        } else if ("child".equals(type)) {
            return new ChildSuperMan();
        }
        return null;
    }

}
