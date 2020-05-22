package com.peigong.patterns.chapter30.factorymethod_vs_builder.builder;

/**
 * @author: lilei
 * @create: 2020-05-22 14:05
 **/
public class ChildSuperManBuilder extends Builder {
    @Override
    public SuperMan build() {
        return setBody("轻盈").setSpecialSymbol("s").setSpecialTalent("飞速移动").superMan;
    }
}
