package com.peigong.patterns.chapter18_strategy.ext;

public enum Calculator {
    ADD("+"){
        @Override
        public int exec(int a, int b) {
            return a+b;
        }
    },
    SUB("-"){
        @Override
        public int exec(int a, int b) {
            return a-b;
        }
    }
    ;

    public static Calculator get(String symbol) {
        for (Calculator value : Calculator.values()) {
            if (value.value.equals(symbol)) {
                return value;
            }
        }
        return null;
    }

    private String value;

    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract int exec(int a, int b);

}
