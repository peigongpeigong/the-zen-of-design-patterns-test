package com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy;

import com.peigong.patterns.chapter35.mock_trade_syatem.Card;
import com.peigong.patterns.chapter35.mock_trade_syatem.Trade;

/**
 * @author: lilei
 * @create: 2020-05-25 14:02
 **/
public class SteadyStrategy implements PayStrategy {
    @Override
    public boolean exec(Card card, Trade trade) {
        int halfMoney = (int) Math.rint(trade.getAmount() * 100 / 2.0);
        card.setFreeMoney(card.getFreeMoney() - halfMoney);
        card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
        return true ;
    }
}
