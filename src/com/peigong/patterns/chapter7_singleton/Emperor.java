package com.peigong.patterns.chapter7_singleton;

/**
 * @author: lilei
 * @create: 2020-05-17 14:06
 **/
public class Emperor {

    private static final Emperor emperor = new Emperor();

    private Emperor(){}

    public static Emperor getInstance() {
        return emperor;
    }

    public void whoAmI(){
        System.out.println(this);
    }

}
