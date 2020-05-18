package com.peigong.patterns.chapter10_templatemethod;

/**
 * @author: lilei
 * @create: 2020-05-18 10:50
 **/
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("Hummer H2 Start");
    }

    @Override
    protected void stop() {
        System.out.println("Hummer H2 Stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Hummer H2 Alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Hummer H2 Engine Running");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
