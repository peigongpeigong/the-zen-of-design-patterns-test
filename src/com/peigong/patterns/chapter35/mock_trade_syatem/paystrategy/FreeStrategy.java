package com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy;

import com.peigong.patterns.chapter35.mock_trade_syatem.Card;
import com.peigong.patterns.chapter35.mock_trade_syatem.Trade;

/**
 * @author: lilei
 * @create: 2020-05-25 14:04
 **/
public class FreeStrategy implements PayStrategy {
    @Override
    public boolean exec(Card card, Trade trade) {
        card.setFreeMoney(card.getFreeMoney() - (trade.getAmount() * 100));
        return true;
    }
}
