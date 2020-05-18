package com.peigong.patterns.chapter14_mediator;

/**
 * @author: lilei
 * @create: 2020-05-18 16:52
 **/
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objs) {
        if ("purchase.buy".equals(str)) {
            buyComputer((Integer)objs[0]);
        } else if ("sale.sell".equals(str)) {
            sellComputer((Integer)objs[0]);
        } else if ("sale.offSale".equals(str)) {
            offSell();
        } else if ("stock.clear".equals(str)) {
            clearStock();
        }
    }

    private void buyComputer(int num) {
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购电脑：" + num + "台");
            stock.increase(num);
        }else{
            System.out.println("采购电脑：" + (num / 2) + "台");
            stock.increase(num /2);
        }
    }

    private void sellComputer(int num) {
        if (stock.getComputerNumber() < num) {
            purchase.buyComputer(num);
        }
        stock.decrease(num);
    }

    private void offSell(){
        System.out.println("打折出售" + stock.getComputerNumber() + "台电脑");
    }

    private void clearStock(){
        sale.offSale();
        purchase.refuseBuyComputer();
    }
}
