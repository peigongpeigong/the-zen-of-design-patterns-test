package com.peigong.patterns.chapter30.factorymethod_vs_builder.builder;

/**
 * @author: lilei
 * @create: 2020-05-22 13:57
 **/
public class SuperMan {

    private String body;

    private String specialTalent;

    private String specialSymbol;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSpecialTalent() {
        return specialTalent;
    }

    public void setSpecialTalent(String specialTalent) {
        this.specialTalent = specialTalent;
    }

    public String getSpecialSymbol() {
        return specialSymbol;
    }

    public void setSpecialSymbol(String specialSymbol) {
        this.specialSymbol = specialSymbol;
    }
}
