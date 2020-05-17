package com.peigong.patterns.chapter8_factory.ext2;

import com.peigong.patterns.chapter8_factory.BlackHuman;
import com.peigong.patterns.chapter8_factory.Human;

/**
 * @author: lilei
 * @create: 2020-05-17 15:23
 **/
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
