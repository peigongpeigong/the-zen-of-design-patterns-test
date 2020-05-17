package com.peigong.patterns.chapter9_abstractfactory.factory;

import com.peigong.patterns.chapter9_abstractfactory.Human;

public interface HumanFactory {

    Human createYellowHuman();

    Human createBlackHuman();

    Human createWhiteHuman();

}
