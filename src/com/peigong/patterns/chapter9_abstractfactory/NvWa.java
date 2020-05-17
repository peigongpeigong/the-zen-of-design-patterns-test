package com.peigong.patterns.chapter9_abstractfactory;

import com.peigong.patterns.chapter9_abstractfactory.factory.FemaleFactory;
import com.peigong.patterns.chapter9_abstractfactory.factory.HumanFactory;
import com.peigong.patterns.chapter9_abstractfactory.factory.MaleFactory;

/**
 * @author: lilei
 * @create: 2020-05-17 16:26
 **/
public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();

        Human maleYellow = maleFactory.createYellowHuman();
        Human femaleYellow = femaleFactory.createYellowHuman();
        maleYellow.color();
        maleYellow.talk();
        maleYellow.sex();

        femaleYellow.color();
        femaleYellow.talk();
        femaleYellow.sex();
    }

}
