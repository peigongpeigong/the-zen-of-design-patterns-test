package com.peigong.patterns.chapter9_abstractfactory;

/**
 * @author: lilei
 * @create: 2020-05-17 16:21
 **/
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void sex() {
        System.out.println("Male Black");
    }
}
