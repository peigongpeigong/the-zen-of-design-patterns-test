package com.peigong.patterns.chapter35.mock_trade_syatem;

import com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy.PayStrategy;
import com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy.StrategyFactory;
import com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy.StrategyType;
import com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy.StrategyWrapper;

/**
 * @author: lilei
 * @create: 2020-05-25 14:20
 **/
public class PayFacade {

    public static Card deduct(Card card, Trade trade) {
        StrategyType strategyType = mockStrategyType(trade.getTradeNo());
        PayStrategy strategy = StrategyFactory.getStrategy(strategyType);
        StrategyWrapper wrapper = new StrategyWrapper(strategy);
        wrapper.exec(card, trade);
        return card;
    }

    public static StrategyType mockStrategyType(String tradeNo) {
        if (tradeNo.startsWith("F")) {
            return StrategyType.FreeStrategy;
        } else {
            return StrategyType.SteadyStrategy;
        }
    }

}
