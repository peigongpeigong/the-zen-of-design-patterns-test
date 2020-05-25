package com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy;

import com.peigong.patterns.chapter35.mock_trade_syatem.Card;
import com.peigong.patterns.chapter35.mock_trade_syatem.Trade;

public interface PayStrategy {

    boolean exec(Card card, Trade trade);

}
