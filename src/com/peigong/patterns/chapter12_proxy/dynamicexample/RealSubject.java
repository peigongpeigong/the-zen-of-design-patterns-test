package com.peigong.patterns.chapter12_proxy.dynamicexample;

/**
 * @author: lilei
 * @create: 2020-05-18 14:27
 **/
public class RealSubject implements Subject {
    @Override
    public void doSomething(String string) {
        System.out.println("do something ----> " + string);
    }
}
