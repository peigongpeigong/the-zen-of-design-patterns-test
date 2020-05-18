package com.peigong.patterns.chapter12_proxy.dynamicexample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: lilei
 * @create: 2020-05-18 14:27
 **/
public class MyInvocationHandler implements InvocationHandler {

    private Object object = null;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
    }
}
