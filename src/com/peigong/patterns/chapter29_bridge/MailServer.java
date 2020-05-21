package com.peigong.patterns.chapter29_bridge;

/**
 * @author: lilei
 * @create: 2020-05-21 16:46
 **/
public abstract class MailServer {

    protected MailTemplate mail;

    public MailServer(MailTemplate mail) {
        this.mail = mail;
    }

    public void sendMail() {
        System.out.println("正在发送的邮件信息");
        System.out.println("发件人:\t" + mail.getFrom());
        System.out.println("收件人:\t" + mail.getTo());
        System.out.println("标题:\t" + mail.getSubject());
        System.out.println("内容:\t" + mail.getContent());
    }
}
