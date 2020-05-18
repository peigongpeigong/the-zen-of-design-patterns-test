package com.peigong.patterns.chapter12_proxy.force;

/**
 * @author: lilei
 * @create: 2020-05-18 13:46
 **/
public class GamePlayer implements IGamePlayer {

    private String name;
    private IGamePlayer proxy;

    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login(String user, String pwd) {
        if (this.proxy == null) {
            System.out.println("请用代理");
            return;
        }
        System.out.println(user + " 登陆");
    }

    @Override
    public void killBoss() {
        if (this.proxy == null) {
            System.out.println("请用代理");
            return;
        }
        System.out.println("打怪");
    }

    @Override
    public void upgrade() {
        if (this.proxy == null) {
            System.out.println("请用代理");
            return;
        }
        System.out.println("升级");
    }

    @Override
    public IGamePlayer getProxy() {
        if (this.proxy == null) {
            this.proxy = new GamePlayerProxy(this);
        }
        return this.proxy;
    }
}
