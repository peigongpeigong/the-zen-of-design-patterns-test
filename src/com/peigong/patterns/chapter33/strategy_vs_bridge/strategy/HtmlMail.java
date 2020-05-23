package com.peigong.patterns.chapter33.strategy_vs_bridge.strategy;

/**
 * @author: lilei
 * @create: 2020-05-23 14:33
 **/
public class HtmlMail extends MailTemplate {

    public HtmlMail(String from, String to, String subject, String content) {
        super(from, to, subject, content);
    }

    @Override
    public String getContent() {
        return "Content-Type:text/html;\n" + super.getContent();
    }
}
