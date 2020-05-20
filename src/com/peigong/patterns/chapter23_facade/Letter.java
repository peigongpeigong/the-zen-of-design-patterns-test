package com.peigong.patterns.chapter23_facade;

public interface Letter {

    void writeContent(String content);

    void fillEnvelope(String address);

    void letterIntoEnvelope();

    void sendLetter();

}
