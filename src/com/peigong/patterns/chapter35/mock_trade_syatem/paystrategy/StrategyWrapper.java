package com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy;

import com.peigong.patterns.chapter35.mock_trade_syatem.Card;
import com.peigong.patterns.chapter35.mock_trade_syatem.Trade;

/**
 * @author: lilei
 * @create: 2020-05-25 14:05
 **/
public class StrategyWrapper {

    private PayStrategy strategy;

    public StrategyWrapper(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean exec(Card card, Trade trade) {
        return strategy.exec(card, trade);
    }
}
