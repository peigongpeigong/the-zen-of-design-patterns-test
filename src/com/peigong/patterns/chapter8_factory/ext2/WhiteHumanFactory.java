package com.peigong.patterns.chapter8_factory.ext2;

import com.peigong.patterns.chapter8_factory.Human;
import com.peigong.patterns.chapter8_factory.WhiteHuman;

/**
 * @author: lilei
 * @create: 2020-05-17 15:22
 **/
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }

}
