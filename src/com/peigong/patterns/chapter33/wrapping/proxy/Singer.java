package com.peigong.patterns.chapter33.wrapping.proxy;

/**
 * @author: lilei
 * @create: 2020-05-25 09:40
 **/
public class Singer implements Superstar {
    @Override
    public void sign() {
        System.out.println("签了个名");
    }
}
