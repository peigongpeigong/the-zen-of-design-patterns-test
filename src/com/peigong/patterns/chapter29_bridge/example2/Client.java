package com.peigong.patterns.chapter29_bridge.example2;

/**
 * @author: lilei
 * @create: 2020-05-22 11:46
 **/
public class Client {

    public static void main(String[] args) {
        MessageImplementor m = new MessageSMS();
        AbstractMessage msg = new CommonMessage(m);
        msg.sendMessage("加班","33");
        m = new MessageEmail();
        msg = new UrgencyMessage(m);
        msg.sendMessage("有bug","33");
    }

}
