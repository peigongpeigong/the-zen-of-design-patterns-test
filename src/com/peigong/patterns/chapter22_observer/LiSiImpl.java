package com.peigong.patterns.chapter22_observer;

/**
 * @author: lilei
 * @create: 2020-05-20 13:59
 **/
public class LiSiImpl implements LiSi,Observer {
    @Override
    public void doSomething(Object obj) {
        System.out.println("报告始皇：" + obj);
    }

    @Override
    public void update(Object obj) {
        System.out.println("李斯知道了：" + obj);
        doSomething(obj);
    }
}
