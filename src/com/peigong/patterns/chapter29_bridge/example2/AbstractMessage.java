package com.peigong.patterns.chapter29_bridge.example2;

/**
 * @author: lilei
 * @create: 2020-05-22 11:30
 **/
public abstract class AbstractMessage {

    private MessageImplementor imp;

    public AbstractMessage(MessageImplementor imp) {
        this.imp = imp;
    }

    public void sendMessage(String msg, String to) {
        imp.send(msg,to);
    }
}
