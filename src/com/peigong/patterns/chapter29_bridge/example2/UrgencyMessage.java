package com.peigong.patterns.chapter29_bridge.example2;

/**
 * @author: lilei
 * @create: 2020-05-22 11:40
 **/
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor imp) {
        super(imp);
    }

    @Override
    public void sendMessage(String msg, String to) {
        super.sendMessage("加急："+msg, to);
    }

    /**
     * 扩展一些功能
     * @param message
     * @param to
     * @return
     */
    public Object watch(String message, String to) {
        return null;
    }
}
