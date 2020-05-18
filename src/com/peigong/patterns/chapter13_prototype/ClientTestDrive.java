package com.peigong.patterns.chapter13_prototype;

import java.util.Random;

/**
 * @author: lilei
 * @create: 2020-05-18 15:58
 **/
public class ClientTestDrive {

    public static void main(String[] args) throws Exception{
        AdvTemplate template = new AdvTemplate();
        //假设mail的创建有一定的消耗
        Mail mail = new Mail(template);
        for (int i = 0; i < 5; i++) {
            Mail m = (Mail)mail.clone();
            mail.setReceiver(getRandomString(6) + "@" + getRandomString(4) + ".com");
            sendMail(mail);
        }
    }

    public static void sendMail(Mail mail){
        System.out.println("标题：" + mail.getSubject() +"\t收件人:" + mail.getReceiver() + "\t发送成功.");
    }

    public static String getRandomString(int len){
        String source = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }

}
