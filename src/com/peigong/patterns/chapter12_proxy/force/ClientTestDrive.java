package com.peigong.patterns.chapter12_proxy.force;

/**
 * @author: lilei
 * @create: 2020-05-18 13:52
 **/
public class ClientTestDrive {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = player.getProxy();
        proxy.login("123", "456");
        proxy.killBoss();
        proxy.upgrade();
    }

}
