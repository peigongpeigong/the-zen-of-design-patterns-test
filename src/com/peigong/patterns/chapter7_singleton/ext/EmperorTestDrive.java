package com.peigong.patterns.chapter7_singleton.ext;

/**
 * @author: lilei
 * @create: 2020-05-17 14:30
 **/
public class EmperorTestDrive {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Emperor instance = Emperor.getInstance();
            instance.whoAmI();
        }
    }

}
