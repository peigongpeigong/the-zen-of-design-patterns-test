package com.peigong.patterns.chapter8_factory.ext1;

import com.peigong.patterns.chapter8_factory.Human;
import com.peigong.patterns.chapter8_factory.YellowHuman;

/**
 * @author: lilei
 * @create: 2020-05-17 15:16
 **/
public class HumanFactory {

    public static <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = (T) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }

    public static void main(String[] args) {
        YellowHuman human = createHuman(YellowHuman.class);
        human.getColor();
        human.talk();
    }

}
