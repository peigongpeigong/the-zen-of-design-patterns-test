package com.peigong.patterns.chapter33.wrapping.proxy;

/**
 * @author: lilei
 * @create: 2020-05-25 09:41
 **/
public class Client {

    public static void main(String[] args) {
        Superstar singer = new Singer();
        Superstar agent = new Agent(singer);
        agent.sign();
    }

}
