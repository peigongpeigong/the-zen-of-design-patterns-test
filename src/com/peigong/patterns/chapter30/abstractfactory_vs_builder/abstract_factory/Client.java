package com.peigong.patterns.chapter30.abstractfactory_vs_builder.abstract_factory;

/**
 * @author: lilei
 * @create: 2020-05-22 15:14
 **/
public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        Car car = client.buildMPV(new BenzFactory());
        System.out.println(car.getBand());
        System.out.println(car.getModel());
        car = client.buildSedan(new ToyotaFactory());
        System.out.println(car.getBand());
        System.out.println(car.getModel());

    }

    public Car buildMPV(CarFactory carFactory) {
        return carFactory.buildMPV();
    }

    public Car buildSedan(CarFactory carFactory) {
        return carFactory.buildSedan();
    }

}
