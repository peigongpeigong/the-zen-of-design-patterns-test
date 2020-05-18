package com.peigong.patterns.chapter10_templatemethod;

/**
 * @author: lilei
 * @create: 2020-05-18 10:48
 **/
public class HummerH1Model extends HummerModel {

    protected boolean alarm = true;

    @Override
    protected void start() {
        System.out.println("Hummer H1 Start");
    }

    @Override
    protected void stop() {
        System.out.println("Hummer H1 Stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Hummer H1 Alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Hummer H1 Engine Running");
    }

    @Override
    public boolean isAlarm() {
        return alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }
}
