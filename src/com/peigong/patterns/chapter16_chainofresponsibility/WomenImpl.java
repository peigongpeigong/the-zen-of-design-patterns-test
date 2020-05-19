package com.peigong.patterns.chapter16_chainofresponsibility;

/**
 * @author: lilei
 * @create: 2020-05-19 13:51
 **/
public class WomenImpl implements Women {

    private int type;
    private String request;

    public WomenImpl(int type, String request) {
        this.type = type;
        switch (type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求时：" + request;
                break;
            case 3:
                this.request = "母亲的请求时：" + request;
                break;
        }
    }

    @Override
    public int getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }
}
