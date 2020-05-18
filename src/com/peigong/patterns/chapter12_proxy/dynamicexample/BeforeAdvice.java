package com.peigong.patterns.chapter12_proxy.dynamicexample;

/**
 * @author: lilei
 * @create: 2020-05-18 14:29
 **/
public class BeforeAdvice implements Advice {
    @Override
    public void exec() {
        System.out.println("Before Advice");
    }
}
