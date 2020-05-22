package com.peigong.patterns.chapter30.abstractfactory_vs_builder.builder;

/**
 * @author: lilei
 * @create: 2020-05-22 15:27
 **/
public class CarBuilder {

    private Wheel wheel;

    private Engine engine;

    public CarBuilder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car build(){
        return new Car(this);
    }


}
