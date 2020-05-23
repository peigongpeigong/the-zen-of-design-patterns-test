package com.peigong.patterns.chapter33.strategy_vs_bridge.strategy;

/**
 * @author: lilei
 * @create: 2020-05-23 14:35
 **/
public class Client {

    public static void main(String[] args) {
        MailTemplate mt = new HtmlMail("a@qq.com", "b@qq.com", "哈哈哈", "666");
        Postman postman = new Postman();
        postman.setMailTemplate(mt);
        postman.sendMail();
        MailTemplate text = new TextMail("a@qq.com", "b@qq.com", "来来来", "来不来");
        postman.setMailTemplate(text);
        postman.sendMail();
    }

}
