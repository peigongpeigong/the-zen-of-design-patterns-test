package com.peigong.patterns.chapter33.wrapping.decorator;

/**
 * @author: lilei
 * @create: 2020-05-25 09:42
 **/
public class FakeStar implements Superstar {
    @Override
    public void act() {
        System.out.println("演技很拙劣");
    }
}
