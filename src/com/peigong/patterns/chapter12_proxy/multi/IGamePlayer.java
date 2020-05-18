package com.peigong.patterns.chapter12_proxy.multi;

/**
 * @author: lilei
 * @create: 2020-05-18 13:45
 **/
public interface IGamePlayer {

    void login(String user, String pwd);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();

}
