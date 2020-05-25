package com.peigong.patterns.chapter35.mock_trade_syatem;

/**
 * @author: lilei
 * @create: 2020-05-25 13:58
 **/
public class Card {

    private String cardNo;

    private int steadyMoney;

    private int freeMoney;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getSteadyMoney() {
        return steadyMoney;
    }

    public void setSteadyMoney(int steadyMoney) {
        this.steadyMoney = steadyMoney;
    }

    public int getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(int freeMoney) {
        this.freeMoney = freeMoney;
    }
}
