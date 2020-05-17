package com.peigong.patterns.chapter9_abstractfactory.factory;

import com.peigong.patterns.chapter9_abstractfactory.FemaleBlackHuman;
import com.peigong.patterns.chapter9_abstractfactory.FemaleWhiteHuman;
import com.peigong.patterns.chapter9_abstractfactory.FemaleYellowHuman;
import com.peigong.patterns.chapter9_abstractfactory.Human;

/**
 * @author: lilei
 * @create: 2020-05-17 16:25
 **/
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
