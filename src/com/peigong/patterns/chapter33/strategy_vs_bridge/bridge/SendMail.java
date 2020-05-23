package com.peigong.patterns.chapter33.strategy_vs_bridge.bridge;

/**
 * @author: lilei
 * @create: 2020-05-23 14:44
 **/
public class SendMail extends MailServer {

    public SendMail(Mail mail) {
        super(mail);
    }

    @Override
    public void sendMail() {
        mail.addFlag("Send By [ SendMail ]");
        super.sendMail();
    }
}
