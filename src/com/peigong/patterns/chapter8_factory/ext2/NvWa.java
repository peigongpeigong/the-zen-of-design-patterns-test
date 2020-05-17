package com.peigong.patterns.chapter8_factory.ext2;

import com.peigong.patterns.chapter8_factory.Human;

/**
 * @author: lilei
 * @create: 2020-05-17 15:26
 **/
public class NvWa {

    public static void main(String[] args) {
        NvWa nvWa = new NvWa();
        Human white = nvWa.createHuman(new WhiteHumanFactory());
        white.getColor();
        white.talk();

        Human black = nvWa.createHuman(new BlackHumanFactory());
        black.getColor();
        black.talk();

        Human yellow = nvWa.createHuman(new YellowHumanFactory());
        yellow.getColor();
        yellow.talk();
    }

    public Human createHuman(AbstractHumanFactory factory) {
        return factory.createHuman();
    }

}
