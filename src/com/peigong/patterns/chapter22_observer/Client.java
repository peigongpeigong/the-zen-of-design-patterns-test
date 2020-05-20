package com.peigong.patterns.chapter22_observer;

/**
 * @author: lilei
 * @create: 2020-05-20 14:00
 **/
public class Client {


    public static void main(String[] args) {
        HanFeiZiImpl hanFeiZi = new HanFeiZiImpl();
        Observer liSi = new LiSiImpl();
        hanFeiZi.addObserver(liSi);

        hanFeiZi.eating();
        System.out.println("-------------");
        hanFeiZi.sleeping();
    }
}
