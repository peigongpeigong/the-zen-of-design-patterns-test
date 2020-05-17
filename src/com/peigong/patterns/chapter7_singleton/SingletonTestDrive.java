package com.peigong.patterns.chapter7_singleton;

/**
 * @author: lilei
 * @create: 2020-05-17 14:08
 **/
public class SingletonTestDrive {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            Emperor emperor = Emperor.getInstance();
            emperor.whoAmI();
        }
    }

}
