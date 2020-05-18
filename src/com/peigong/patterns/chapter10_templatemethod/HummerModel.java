package com.peigong.patterns.chapter10_templatemethod;

public abstract class HummerModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected boolean isAlarm(){
        return true;
    }

    public final void run(){
        start();
        engineBoom();
        if (isAlarm()) {
            alarm();
        }
        stop();
    }

}
