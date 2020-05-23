package com.peigong.patterns.chapter33.facade_vs_mediator.facade;

import java.util.Random;

/**
 * @author: lilei
 * @create: 2020-05-23 15:34
 **/
public class Tax {

    public int getTax(){
        return new Random().nextInt(300);
    }

}
