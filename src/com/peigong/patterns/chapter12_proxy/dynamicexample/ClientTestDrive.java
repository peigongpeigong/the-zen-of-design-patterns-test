package com.peigong.patterns.chapter12_proxy.dynamicexample;

/**
 * @author: lilei
 * @create: 2020-05-18 14:31
 **/
public class ClientTestDrive {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("123");
    }

}
