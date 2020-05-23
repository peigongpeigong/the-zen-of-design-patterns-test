package com.peigong.patterns.chapter33.strategy_vs_bridge.strategy;

/**
 * @author: lilei
 * @create: 2020-05-23 14:36
 **/
public class Postman {

    private MailTemplate mailTemplate;

    public void setMailTemplate(MailTemplate mailTemplate) {
        this.mailTemplate = mailTemplate;
    }

    public void sendMail() {
        System.out.println("发件人：" + mailTemplate.getFrom());
        System.out.println("收件人：" + mailTemplate.getTo());
        System.out.println("标题：" + mailTemplate.getSubject());
        System.out.println("内容：" + mailTemplate.getContent());
    }
}
