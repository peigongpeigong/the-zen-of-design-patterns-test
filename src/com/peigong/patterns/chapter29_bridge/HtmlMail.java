package com.peigong.patterns.chapter29_bridge;

/**
 * @author: lilei
 * @create: 2020-05-21 16:52
 **/
public class HtmlMail extends MailTemplate {

    public HtmlMail(String from, String to, String subject, String content) {
        super(from, to, subject, content);
    }

    @Override
    public String getContent() {
        //超文本类型则设置邮件的格式为：multipart/mixed
        String content = "\nContent-Type: multipart/mixed;charset=GB2312\n"+super.getContent();
        //同时对邮件进行HTML检查，是否有类似未关闭的标签
        content = content + "\n邮件格式为：超文本格式";
        return content;
    }
}
