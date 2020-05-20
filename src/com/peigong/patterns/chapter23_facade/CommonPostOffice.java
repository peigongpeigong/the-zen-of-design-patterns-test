package com.peigong.patterns.chapter23_facade;

/**
 * @author: lilei
 * @create: 2020-05-20 14:39
 **/
public class CommonPostOffice implements PostOffice {

    private Police police;

    public CommonPostOffice(Police police) {
        this.police = police;
    }

    @Override
    public void sendLetter(String content, String address) {
        Letter letter = new LoveLetter();
        letter.writeContent(content);
        letter.fillEnvelope(address);
        police.checkLetter(letter);
        letter.letterIntoEnvelope();
        letter.sendLetter();
    }
}
