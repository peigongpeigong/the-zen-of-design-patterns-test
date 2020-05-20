package com.peigong.patterns.chapter23_facade;

/**
 * @author: lilei
 * @create: 2020-05-20 14:40
 **/
public class Client {

    public static void main(String[] args) {
        PostOffice office = new CommonPostOffice(new Auditor());
        office.sendLetter("你好吗", "村东头儿");
    }

}
