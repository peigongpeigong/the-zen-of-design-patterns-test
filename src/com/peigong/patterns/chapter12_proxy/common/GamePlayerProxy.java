package com.peigong.patterns.chapter12_proxy.common;

/**
 * @author: lilei
 * @create: 2020-05-18 13:50
 **/
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer player = null;

    public GamePlayerProxy(String name) {
        try {
            this.player = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    }
}
