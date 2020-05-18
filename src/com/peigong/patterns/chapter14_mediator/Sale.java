package com.peigong.patterns.chapter14_mediator;

import java.util.Random;

/**
 * @author: lilei
 * @create: 2020-05-18 16:48
 **/
public class Sale extends AbstractColleague{

    private Random random = new Random();

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public int getSaleStatus(){
        int saleStatus = random.nextInt(100);
        System.out.println("电脑销售状态：" + saleStatus);
        return saleStatus;
    }

    public void sellComputer(int num){
        mediator.execute("sale.sell", num);
        System.out.println("销售" + num + "台电脑");
    }

    public void offSale(){
        mediator.execute("sale.offSale");
    }
}
