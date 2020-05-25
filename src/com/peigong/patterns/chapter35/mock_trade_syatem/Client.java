package com.peigong.patterns.chapter35.mock_trade_syatem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author: lilei
 * @create: 2020-05-25 14:23
 **/
public class Client {

    public static void main(String[] args) throws Exception{
        Card card = loadCard();
        printCard(card);
        while (true) {
            Trade trade = mockTrade();
            PayFacade.deduct(card, trade);
            printCard(card);
            System.out.println("退出？");
            if ("y".equals(getInput())) {
                break;
            }
        }
    }

    public static Card loadCard() {
        Card card = new Card();
        card.setFreeMoney(100000);
        card.setSteadyMoney(80000);
        card.setCardNo("10000061");
        return card;
    }

    public static Trade mockTrade() throws Exception{
        Trade trade = new Trade();
        System.out.println("交易编码：");
        trade.setTradeNo(getInput());
        System.out.println("交易金额：");
        trade.setAmount(Integer.parseInt(getInput()));
        return trade;
    }

    public static String getInput() throws Exception{
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static void printCard(Card card){
        System.out.println("******卡面信息******");
        System.out.println("卡号：" + card.getCardNo());
        System.out.println("固定余额：" + card.getSteadyMoney() / 100.0);
        System.out.println("自由约：" + card.getFreeMoney() / 100.0);
        System.out.println("******************");

    }

}
