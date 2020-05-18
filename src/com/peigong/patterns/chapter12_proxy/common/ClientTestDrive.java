package com.peigong.patterns.chapter12_proxy.common;

/**
 * @author: lilei
 * @create: 2020-05-18 13:52
 **/
public class ClientTestDrive {

    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");
        proxy.login("123", "456");
        proxy.killBoss();
        proxy.upgrade();
    }

}
