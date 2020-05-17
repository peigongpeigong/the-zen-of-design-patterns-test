package com.peigong.patterns.chapter9_abstractfactory;

/**
 * @author: lilei
 * @create: 2020-05-17 16:23
 **/
public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("Female White");
    }
}
