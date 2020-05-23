package com.peigong.patterns.chapter33.strategy_vs_bridge.bridge;

/**
 * @author: lilei
 * @create: 2020-05-23 14:42
 **/
public abstract class MailServer {

    protected Mail mail;

    public MailServer(Mail mail) {
        this.mail = mail;
    }

    public void sendMail() {
        System.out.println("发件人：" + mail.getFrom());
        System.out.println("收件人：" + mail.getTo());
        System.out.println("标题：" + mail.getSubject());
        System.out.println("内容：" + mail.getContent());
    }
}
