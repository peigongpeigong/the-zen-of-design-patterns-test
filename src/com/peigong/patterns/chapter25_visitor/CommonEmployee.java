package com.peigong.patterns.chapter25_visitor;

/**
 * @author: lilei
 * @create: 2020-05-20 16:28
 **/
public class CommonEmployee extends Employee {

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
