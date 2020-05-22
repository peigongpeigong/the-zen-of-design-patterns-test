package com.peigong.patterns.chapter30.factorymethod_vs_builder.builder;

/**
 * @author: lilei
 * @create: 2020-05-22 14:03
 **/
public class AdultSuperManBuilder extends Builder {


    @Override
    public SuperMan build() {
        return setBody("强壮的躯体").setSpecialSymbol("S").setSpecialTalent("飞行").superMan;
    }
}
