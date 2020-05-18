package com.peigong.patterns.chapter14_mediator;

/**
 * @author: lilei
 * @create: 2020-05-18 17:04
 **/
public class ClientTestDrive {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        System.out.println("-----采购电脑-----");
        mediator.getPurchase().buyComputer(100);

        System.out.println("-----销售电脑-----");
        mediator.getSale().sellComputer(1);

        System.out.println("-----清理库存-----");
        mediator.getStock().clearStock();
    }

}
