package com.peigong.patterns.chapter11_builder;

/**
 * @author: lilei
 * @create: 2020-05-18 11:39
 **/
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Benz Start");
    }

    @Override
    protected void stop() {
        System.out.println("Benz Stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz Alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz Engine Running");
    }
}
