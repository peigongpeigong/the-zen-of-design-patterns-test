package com.peigong.patterns.chapter30.factorymethod_vs_builder.builder;

/**
 * @author: lilei
 * @create: 2020-05-22 14:05
 **/
public class Client {

    public static void main(String[] args) {
        SuperMan superMan = Director.buildAdult();
        System.out.println(superMan.getSpecialTalent());
    }

}
