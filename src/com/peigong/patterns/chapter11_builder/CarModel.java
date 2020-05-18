package com.peigong.patterns.chapter11_builder;

import java.util.ArrayList;

/**
 * @author: lilei
 * @create: 2020-05-18 11:36
 **/
public abstract class CarModel {

    private ArrayList<String> sequences = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run(){
        for (String action : this.sequences) {
            if ("start".equals(action)) {
                start();
            } else if ("stop".equals(action)) {
                start();
            } else if ("alarm".equals(action)) {
                alarm();
            } else if ("engineBoom".equals(action)) {
                engineBoom();
            }
        }
    }

    public final void setSequences(ArrayList<String> sequences) {
        this.sequences = sequences;
    }

}
