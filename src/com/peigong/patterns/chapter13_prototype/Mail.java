package com.peigong.patterns.chapter13_prototype;

/**
 * @author: lilei
 * @create: 2020-05-18 15:56
 **/
public class Mail implements Cloneable{

    private String receiver;

    private String subject;

    private String appellation;

    private String content;

    private String tail;

    public Mail(AdvTemplate template) {
        this.subject = template.getSubject();
        this.content = template.getContent();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
            //如果对象内部有除基本类型意外的其他对象的引用，则需要将老对象的引用对象clone给新对象
            //mail.list = (ArrayList<String>)this.list.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
