package com.peigong.patterns.chapter27_interpreter;

import java.util.Map;

/**
 * @author: lilei
 * @create: 2020-05-21 14:59
 **/
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) + right.interpreter(var);
    }
}
