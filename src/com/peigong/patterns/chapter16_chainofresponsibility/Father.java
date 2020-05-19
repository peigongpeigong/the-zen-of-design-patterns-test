package com.peigong.patterns.chapter16_chainofresponsibility;

/**
 * @author: lilei
 * @create: 2020-05-19 14:15
 **/
public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL);
    }

    @Override
    public void response(Women women) {
        System.out.println("女儿像父亲请求");
        System.out.println(women.getRequest());
        System.out.println("同意");
    }
}
