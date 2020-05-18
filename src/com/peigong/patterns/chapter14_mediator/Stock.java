package com.peigong.patterns.chapter14_mediator;

/**
 * @author: lilei
 * @create: 2020-05-18 16:48
 **/
public class Stock extends AbstractColleague{

    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int num) {
        COMPUTER_NUMBER += num;
        System.out.println("电脑库存数量为：" + COMPUTER_NUMBER);
    }

    public void decrease(int num) {
        COMPUTER_NUMBER -= num;
        System.out.println("电脑库存数量为：" + COMPUTER_NUMBER);
    }

    public int getComputerNumber(){
        return COMPUTER_NUMBER;
    }

    public void clearStock(){
        System.out.println("清理库存" + COMPUTER_NUMBER + "台电脑");
        mediator.execute("stock.clear");
    }
}
