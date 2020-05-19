package com.peigong.patterns.chapter17_decorator;

/**
 * @author: lilei
 * @create: 2020-05-19 14:43
 **/
public class SortDecorator extends Decorator {


    public SortDecorator(SchoolReport report) {
        super(report);
    }

    private void reportSort(){
        System.out.println("本次排名38");
    }

    @Override
    public void report() {
        super.report();
        reportSort();
    }
}
