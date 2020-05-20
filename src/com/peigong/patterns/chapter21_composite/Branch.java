package com.peigong.patterns.chapter21_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lilei
 * @create: 2020-05-20 11:31
 **/
public class Branch extends Corp {

    private List<Corp> sub = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSub(Corp corp) {
        corp.setParent(this);
        sub.add(corp);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        for (Corp corp : sub) {
            corp.printInfo();
        }
    }
}
