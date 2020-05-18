package com.peigong.patterns.chapter14_mediator;

/**
 * @author: lilei
 * @create: 2020-05-18 16:49
 **/
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str, Object... objs);

    public Purchase getPurchase() {
        return purchase;
    }

    public Sale getSale() {
        return sale;
    }

    public Stock getStock() {
        return stock;
    }
}
