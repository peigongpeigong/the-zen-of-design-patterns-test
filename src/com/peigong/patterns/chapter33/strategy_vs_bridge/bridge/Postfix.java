package com.peigong.patterns.chapter33.strategy_vs_bridge.bridge;

/**
 * @author: lilei
 * @create: 2020-05-23 14:43
 **/
public class Postfix extends MailServer{

    public Postfix(Mail mail) {
        super(mail);
    }

    @Override
    public void sendMail() {
        mail.addFlag("Send By [ Postfix ]");
        super.sendMail();
    }
}
