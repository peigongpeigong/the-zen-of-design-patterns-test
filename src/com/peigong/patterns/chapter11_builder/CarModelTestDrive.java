package com.peigong.patterns.chapter11_builder;

/**
 * @author: lilei
 * @create: 2020-05-18 11:46
 **/
public class CarModelTestDrive {

    public static void main(String[] args) {
        Director director = new Director();
        director.getBenzAModel().run();
        System.out.println();
        director.getBenzBModel().run();
        System.out.println();
        director.getBMWAModel().run();
        System.out.println();
        director.getBMWBModel().run();
    }

}
