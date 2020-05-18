package com.peigong.patterns.chapter12_proxy.common;

/**
 * @author: lilei
 * @create: 2020-05-18 13:46
 **/
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(IGamePlayer player,String name) throws Exception{
        if (player == null) {
            throw new Exception("不能创建");
        }
        this.name = name;
    }

    @Override
    public void login(String user, String pwd) {
        System.out.println(user + " 登陆");
    }

    @Override
    public void killBoss() {
        System.out.println("打怪");
    }

    @Override
    public void upgrade() {
        System.out.println("升级");
    }
}
