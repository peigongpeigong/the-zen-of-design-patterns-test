package com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy;

/**
 * @author: lilei
 * @create: 2020-05-25 14:19
 **/
public class StrategyFactory {

    public static PayStrategy getStrategy(StrategyType strategyType) {
        PayStrategy strategy = null;
        try {
            strategy = (PayStrategy) Class.forName(strategyType.getValue()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strategy;
    }

}
