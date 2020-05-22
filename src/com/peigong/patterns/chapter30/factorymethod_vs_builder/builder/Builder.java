package com.peigong.patterns.chapter30.factorymethod_vs_builder.builder;

/**
 * @author: lilei
 * @create: 2020-05-22 13:58
 **/
public abstract class Builder {

    protected final SuperMan superMan = new SuperMan();

    public Builder setBody(String body) {
        superMan.setBody(body);
        return this;
    }

    public Builder setSpecialTalent(String specialTalent) {
        superMan.setSpecialTalent(specialTalent);
        return this;
    }

    public Builder setSpecialSymbol(String specialSymbol) {
        superMan.setSpecialSymbol(specialSymbol);
        return this;
    }

    public abstract SuperMan build();

}
