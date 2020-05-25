package com.peigong.patterns.chapter33.wrapping.bridge;

/**
 * @author: lilei
 * @create: 2020-05-25 10:12
 **/
public class Singer extends Superstar {

    public Singer(Action action) {
        super(action);
    }

    @Override
    public void doSomething() {
        System.out.println("我是一个歌手");
        super.doSomething();
    }
}
