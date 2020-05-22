package com.peigong.patterns.chapter29_bridge.example2;

/**
 * @author: lilei
 * @create: 2020-05-22 11:39
 **/
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor imp) {
        super(imp);
    }

    @Override
    public void sendMessage(String msg, String to) {
        super.sendMessage(msg, to);
    }
}
