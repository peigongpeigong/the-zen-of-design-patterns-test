package com.peigong.patterns.chapter8_factory;

/**
 * @author: lilei
 * @create: 2020-05-17 14:56
 **/
public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();

        Human white = factory.createHuman(WhiteHuman.class);
        white.getColor();
        white.talk();

        Human black = factory.createHuman(BlackHuman.class);
        black.getColor();
        black.talk();

        Human yellow = factory.createHuman(YellowHuman.class);
        yellow.getColor();
        yellow.talk();
    }

}
