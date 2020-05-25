package com.peigong.patterns.chapter33.wrapping.bridge;


/**
 * @author: lilei
 * @create: 2020-05-25 10:12
 **/
public class Client {

    public static void main(String[] args) {
        Action sing = new Sing();
        Action actFilm = new ActFilm();
        Superstar fs = new Actor(sing);
        Superstar singer = new Singer(actFilm);
        fs.doSomething();
        System.out.println("*******");
        singer.doSomething();
        System.out.println("*******");
        fs = new Actor(actFilm);
        fs.doSomething();
        System.out.println("*******");
        singer = new Singer(sing);
        singer.doSomething();
    }

}
