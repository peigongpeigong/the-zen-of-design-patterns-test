package com.peigong.patterns.chapter33.strategy_vs_bridge.strategy;

/**
 * @author: lilei
 * @create: 2020-05-23 14:32
 **/
public class TextMail extends MailTemplate {

    public TextMail(String from, String to, String subject, String content) {
        super(from, to, subject, content);
    }

    @Override
    public String getContent() {
        String content = "Content-Type:text/plain\n" + super.getContent();
        return content;
    }
}
