package com.peigong.patterns.chapter16_chainofresponsibility;

/**
 * @author: lilei
 * @create: 2020-05-19 14:16
 **/
public class Husband extends Handler{

    public Husband(){
        super(Handler.HUSBAND_LEVEL);
    }


    @Override
    public void response(Women women) {
        System.out.println("妻子向丈夫请求");
        System.out.println(women.getRequest());
        System.out.println("同意");
    }
}
