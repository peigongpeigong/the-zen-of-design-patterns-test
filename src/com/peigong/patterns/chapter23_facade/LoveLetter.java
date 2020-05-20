package com.peigong.patterns.chapter23_facade;

/**
 * @author: lilei
 * @create: 2020-05-20 14:37
 **/
public class LoveLetter implements Letter {
    @Override
    public void writeContent(String content) {
        System.out.println("写内容：" + content);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("写信封：" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("信放入信封");
    }

    @Override
    public void sendLetter() {
        System.out.println("发信");
    }
}
