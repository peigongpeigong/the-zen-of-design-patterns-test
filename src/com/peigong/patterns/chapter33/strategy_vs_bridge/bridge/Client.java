package com.peigong.patterns.chapter33.strategy_vs_bridge.bridge;

/**
 * @author: lilei
 * @create: 2020-05-23 14:45
 **/
public class Client {

    public static void main(String[] args) {
        Mail mail = new HtmlMail("a@qq.com", "b@qq.com", "123", "456");
        MailServer mailServer = new Postfix(mail);
        mailServer.sendMail();
        mail = new TextMail("a@qq.com", "b@qq.com", "666", "来来来");
        mailServer = new SendMail(mail);
        mailServer.sendMail();
    }

}
