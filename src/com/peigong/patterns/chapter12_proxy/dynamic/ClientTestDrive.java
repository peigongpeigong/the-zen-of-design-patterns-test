package com.peigong.patterns.chapter12_proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: lilei
 * @create: 2020-05-18 14:14
 **/
public class ClientTestDrive {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(player.getClass().getClassLoader(), new Class[]{IGamePlayer.class}, new GamePlayerInvocationHandler(player));
        proxy.login("123", "456");
        proxy.killBoss();
        proxy.upgrade();
    }

}
