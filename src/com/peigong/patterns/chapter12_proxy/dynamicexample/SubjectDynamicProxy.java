package com.peigong.patterns.chapter12_proxy.dynamicexample;

import java.lang.reflect.InvocationHandler;

/**
 * @author: lilei
 * @create: 2020-05-18 14:31
 **/
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }

}
