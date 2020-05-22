package com.peigong.patterns.chapter30.abstractfactory_vs_builder.builder;

public class Car {

    private Engine engine;

    private Wheel wheel;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public Car(CarBuilder carBuilder) {
        this.wheel = carBuilder.getWheel();
        this.engine = carBuilder.getEngine();
    }

    public void start(){
        engine.engineStart();
        wheel.moving();
    }
}
