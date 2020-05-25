package com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy;

public enum StrategyType {
    SteadyStrategy("com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy.SteadyStrategy"),
    FreeStrategy("com.peigong.patterns.chapter35.mock_trade_syatem.paystrategy.FreeStrategy")
    ;

    private String value;

    public String getValue(){
        return value;
    }

    StrategyType(String value) {
        this.value = value;
    }
}
