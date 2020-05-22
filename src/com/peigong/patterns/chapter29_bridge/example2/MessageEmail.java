package com.peigong.patterns.chapter29_bridge.example2;

/**
 * @author: lilei
 * @create: 2020-05-22 11:45
 **/
public class MessageEmail implements MessageImplementor {

    @Override
    public void send(String msg, String to) {
        System.out.println("使用Email发消息["+msg+"]给：" + to);
    }
}
