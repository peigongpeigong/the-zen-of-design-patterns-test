package com.peigong.patterns.chapter17_decorator;

/**
 * @author: lilei
 * @create: 2020-05-19 14:41
 **/
public class Decorator extends SchoolReport {

    private SchoolReport report;

    public Decorator(SchoolReport report) {
        this.report = report;
    }

    @Override
    public void report() {
        report.report();
    }

    @Override
    public void sign(String name) {
        report.sign(name);
    }
}
