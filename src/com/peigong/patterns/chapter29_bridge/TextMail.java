package com.peigong.patterns.chapter29_bridge;

/**
 * @author: lilei
 * @create: 2020-05-21 16:51
 **/
public class TextMail extends MailTemplate {

    public TextMail(String from, String to, String subject, String content) {
        super(from, to, subject, content);
    }

    @Override
    public String getContent() {
        String context = "\nContent-Type: text/plain;charset=GB2312\n" +super.getContent();
        //同时对邮件进行base64编码处理,这里用一句话代替
        context = context + "\n邮件格式为：文本格式";
        return context;
    }
}
