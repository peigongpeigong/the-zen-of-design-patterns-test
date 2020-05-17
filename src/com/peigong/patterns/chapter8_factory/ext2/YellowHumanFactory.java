package com.peigong.patterns.chapter8_factory.ext2;

import com.peigong.patterns.chapter8_factory.Human;
import com.peigong.patterns.chapter8_factory.YellowHuman;

/**
 * @author: lilei
 * @create: 2020-05-17 15:23
 **/
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
