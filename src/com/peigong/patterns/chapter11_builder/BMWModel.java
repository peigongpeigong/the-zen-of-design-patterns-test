package com.peigong.patterns.chapter11_builder;

/**
 * @author: lilei
 * @create: 2020-05-18 11:40
 **/
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BMW Start");
    }

    @Override
    protected void stop() {
        System.out.println("BMW Stop");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW Alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMW Engine Running");
    }
}
