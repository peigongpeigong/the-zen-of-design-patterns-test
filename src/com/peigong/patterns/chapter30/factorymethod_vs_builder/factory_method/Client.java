package com.peigong.patterns.chapter30.factorymethod_vs_builder.factory_method;

/**
 * @author: lilei
 * @create: 2020-05-22 13:56
 **/
public class Client {

    public static void main(String[] args) {
        SuperMan superMan = SuperManFactory.createSuperMan("adult");
        superMan.specialTalent();
    }

}
