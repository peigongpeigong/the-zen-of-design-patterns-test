package com.peigong.patterns.chapter16_chainofresponsibility;

/**
 * @author: lilei
 * @create: 2020-05-19 14:17
 **/
public class Son extends Handler {

    public Son(){
        super(Handler.SON_LEVEL);
    }

    @Override
    public void response(Women women) {
        System.out.println("母亲向儿子请求");
        System.out.println(women.getRequest());
        System.out.println("同意");
    }
}
