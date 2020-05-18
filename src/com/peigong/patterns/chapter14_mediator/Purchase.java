package com.peigong.patterns.chapter14_mediator;

/**
 * @author: lilei
 * @create: 2020-05-18 16:48
 **/
public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyComputer(int number) {
        mediator.execute("purchase.buy",number);
    }

    public void refuseBuyComputer(){
        System.out.println("停止采购电脑");
    }
}
