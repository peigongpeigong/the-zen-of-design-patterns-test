package com.peigong.patterns.chapter29_bridge;

/**
 * @author: lilei
 * @create: 2020-05-21 16:53
 **/
public class Client {

    public static void main(String[] args) {
        MailTemplate html = new HtmlMail("a@qq.com", "b@qq.com", "标题", "内容");
        MailServer ms = new Postfix(html);
        ms.sendMail();
    }

}
