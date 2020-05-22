package com.peigong.patterns.chapter30.abstractfactory_vs_builder.builder;

/**
 * @author: lilei
 * @create: 2020-05-22 15:30
 **/
public class Client {

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setEngine(new V6Engine())
                .setWheel(new W175())
                .build();
        car.start();
    }

}
