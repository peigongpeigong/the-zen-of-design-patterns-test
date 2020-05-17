package com.peigong.patterns.chapter9_abstractfactory.factory;

import com.peigong.patterns.chapter9_abstractfactory.Human;
import com.peigong.patterns.chapter9_abstractfactory.MaleBlackHuman;
import com.peigong.patterns.chapter9_abstractfactory.MaleWhiteHuman;
import com.peigong.patterns.chapter9_abstractfactory.MaleYellowHuman;

/**
 * @author: lilei
 * @create: 2020-05-17 16:25
 **/
public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
