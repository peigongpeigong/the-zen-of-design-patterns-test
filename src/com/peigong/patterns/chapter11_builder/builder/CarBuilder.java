package com.peigong.patterns.chapter11_builder.builder;

import com.peigong.patterns.chapter11_builder.CarModel;

import java.util.ArrayList;

/**
 * @author: lilei
 * @create: 2020-05-18 11:40
 **/
public abstract class CarBuilder {

    public abstract void setSequences(ArrayList<String> sequences);

    public abstract CarModel build();

}
