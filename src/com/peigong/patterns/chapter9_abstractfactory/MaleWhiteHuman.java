package com.peigong.patterns.chapter9_abstractfactory;

/**
 * @author: lilei
 * @create: 2020-05-17 16:22
 **/
public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("Male White");
    }
}
