package com.peigong.patterns.chapter11_builder.builder;

import com.peigong.patterns.chapter11_builder.BMWModel;
import com.peigong.patterns.chapter11_builder.CarModel;

import java.util.ArrayList;

/**
 * @author: lilei
 * @create: 2020-05-18 11:42
 **/
public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequences(ArrayList<String> sequences) {
        bmw.setSequences(sequences);
    }

    @Override
    public CarModel build() {
        return bmw;
    }
}
