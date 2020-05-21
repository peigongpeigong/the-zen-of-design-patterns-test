package com.peigong.patterns.chapter29_bridge;

/**
 * @author: lilei
 * @create: 2020-05-21 16:49
 **/
public class Postfix extends MailServer {

    public Postfix(MailTemplate mail) {
        super(mail);
    }

    @Override
    public void sendMail() {
        String content = "Received: from XXXX (unknown [xxx.xxx.xxx.xxx]) by aaa.aaa.com (Postfix) with ESMTP id 8DBCD172B8\n";
        mail.add(content);
        super.sendMail();
    }
}
