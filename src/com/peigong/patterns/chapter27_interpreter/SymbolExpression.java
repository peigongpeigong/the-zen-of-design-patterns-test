package com.peigong.patterns.chapter27_interpreter;

/**
 * @author: lilei
 * @create: 2020-05-21 14:58
 **/
public abstract class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
