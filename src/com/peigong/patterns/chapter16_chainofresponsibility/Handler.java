package com.peigong.patterns.chapter16_chainofresponsibility;

/**
 * @author: lilei
 * @create: 2020-05-19 13:46
 **/
public abstract class Handler {

    public final static int FATHER_LEVEL = 1;
    public final static int HUSBAND_LEVEL = 2;
    public final static int SON_LEVEL = 3;

    private int level = 0;
    private Handler next;

    public Handler(int level) {
        this.level = level;
    }

    public final void handleMessage(Women women) {
        if (women.getType() == this.level) {
            response(women);
        }else{
            if (next != null) {
                next.handleMessage(women);
            }else{
                System.out.println("链尾，不处理");
            }
        }
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void response(Women women);

}
