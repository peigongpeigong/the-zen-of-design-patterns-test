package com.peigong.patterns.chapter12_proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: lilei
 * @create: 2020-05-18 14:11
 **/
public class GamePlayerInvocationHandler implements InvocationHandler {

    private Object obj = null;

    public GamePlayerInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if (method.getName().equals("login")) {
            System.out.println(args[0] + "登陆");
        }
        return result;
    }
}
