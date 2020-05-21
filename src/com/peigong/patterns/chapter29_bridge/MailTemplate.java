package com.peigong.patterns.chapter29_bridge;

/**
 * @author: lilei
 * @create: 2020-05-21 16:43
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

    public void add(String sendInfo) {
        content = sendInfo + content;
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
