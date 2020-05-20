package com.peigong.patterns.chapter23_facade;

/**
 * @author: lilei
 * @create: 2020-05-20 14:42
 **/
public class Auditor implements Police {
    @Override
    public void checkLetter(Letter letter) {
        System.out.println("没毛病");
    }
}
