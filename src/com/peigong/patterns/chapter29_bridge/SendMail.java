package com.peigong.patterns.chapter29_bridge;

/**
 * @author: lilei
 * @create: 2020-05-21 16:50
 **/
public class SendMail extends MailServer {

    public SendMail(MailTemplate mail) {
        super(mail);
    }

    @Override
    public void sendMail() {
        mail.add("Received: (sendmail); 7 Nov 2009 04:14:44 +0100");
        super.sendMail();
    }
}
