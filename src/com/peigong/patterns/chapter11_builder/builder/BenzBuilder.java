package com.peigong.patterns.chapter11_builder.builder;

import com.peigong.patterns.chapter11_builder.BenzModel;
import com.peigong.patterns.chapter11_builder.CarModel;

import java.util.ArrayList;

/**
 * @author: lilei
 * @create: 2020-05-18 11:41
 **/
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequences(ArrayList<String> sequences) {
        this.benz.setSequences(sequences);
    }

    @Override
    public CarModel build() {
        return benz;
    }
}
