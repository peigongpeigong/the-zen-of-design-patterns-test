package com.peigong.patterns.chapter11_builder;

import com.peigong.patterns.chapter11_builder.builder.BMWBuilder;
import com.peigong.patterns.chapter11_builder.builder.BenzBuilder;

import java.util.ArrayList;

/**
 * @author: lilei
 * @create: 2020-05-18 11:43
 **/
public class Director {

    private ArrayList<String> sequences = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getBenzAModel(){
        this.sequences.clear();
        this.sequences.add("start");
        this.sequences.add("stop");
        this.benzBuilder.setSequences(this.sequences);
        return (BenzModel) this.benzBuilder.build();
    }

    public BenzModel getBenzBModel(){
        this.sequences.clear();
        this.sequences.add("engineBoom");
        this.sequences.add("start");
        this.sequences.add("stop");
        this.benzBuilder.setSequences(this.sequences);
        return (BenzModel) this.benzBuilder.build();
    }

    public BMWModel getBMWAModel(){
        this.sequences.clear();
        this.sequences.add("alarm");
        this.sequences.add("start");
        this.sequences.add("stop");
        this.bmwBuilder.setSequences(this.sequences);
        return (BMWModel) this.bmwBuilder.build();
    }

    public BMWModel getBMWBModel(){
        this.sequences.clear();
        this.sequences.add("start");
        this.bmwBuilder.setSequences(this.sequences);
        return (BMWModel) this.bmwBuilder.build();
    }

}
