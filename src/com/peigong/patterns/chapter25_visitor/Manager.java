package com.peigong.patterns.chapter25_visitor;

/**
 * @author: lilei
 * @create: 2020-05-20 16:29
 **/
public class Manager extends Employee {

    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
