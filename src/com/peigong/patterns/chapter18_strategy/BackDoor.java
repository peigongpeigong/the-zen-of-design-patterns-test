package com.peigong.patterns.chapter18_strategy;

/**
 * @author: lilei
 * @create: 2020-05-19 15:06
 **/
public class BackDoor implements Strategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙");
    }
}
