package com.peigong.patterns.chapter12_proxy.multi;

/**
 * @author: lilei
 * @create: 2020-05-18 13:50
 **/
public class GamePlayerProxy implements IGamePlayer,IProxy {

    private IGamePlayer player = null;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public void login(String user, String pwd) {
        this.player.login(user,pwd);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void upgrade() {
        this.player.upgrade();
        this.count();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }

    @Override
    public void count() {
        System.out.println("升一级5块钱");
    }
}
