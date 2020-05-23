package com.peigong.patterns.chapter33.facade_vs_mediator.facade;

import java.util.Random;

/**
 * @author: lilei
 * @create: 2020-05-23 15:33
 **/
public class Performance {

    private BasicSalary basicSalary;

    public Performance(BasicSalary basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int  getPerformanceValue(){
        int perf = new Random().nextInt(100);
        return basicSalary.getBasicSalary() * perf / 100;
    }

}
