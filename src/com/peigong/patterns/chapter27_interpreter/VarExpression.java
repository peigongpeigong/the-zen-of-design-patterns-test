package com.peigong.patterns.chapter27_interpreter;

import java.util.Map;

/**
 * @author: lilei
 * @create: 2020-05-21 14:57
 **/
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(key);
    }
}
