package com.peigong.patterns.chapter27_interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @author: lilei
 * @create: 2020-05-21 15:00
 **/
public class Calculator {

    private Expression expression;

    public Calculator(String expressionString) {
        Stack<Expression> stack = new Stack<>();
        char[] chars = expressionString.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+' :
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '_':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int calculate(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
