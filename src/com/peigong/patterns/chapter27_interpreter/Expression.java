package com.peigong.patterns.chapter27_interpreter;

import java.util.Map;

/**
 * @author: lilei
 * @create: 2020-05-21 14:56
 **/
public abstract class Expression {

    public abstract int interpreter(Map<String, Integer> var);


}
