package com.peigong.patterns.chapter33.strategy_vs_bridge.strategy;

/**
 * @author: lilei
 * @create: 2020-05-23 14:29
 **/
public abstract class MailTemplate {

    private String from;

    private String to;

    private String subject;

    private String content;

    public MailTemplate(String from, String to, String subject, String content) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
