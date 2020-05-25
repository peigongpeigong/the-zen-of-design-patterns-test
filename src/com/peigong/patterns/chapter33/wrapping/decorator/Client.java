package com.peigong.patterns.chapter33.wrapping.decorator;

/**
 * @author: lilei
 * @create: 2020-05-25 09:45
 **/
public class Client {

    public static void main(String[] args) {
        Superstar superstar = new FakeStar();
        superstar = new HotAir(superstar);
        superstar = new Deny(superstar);
        superstar.act();
    }

}
