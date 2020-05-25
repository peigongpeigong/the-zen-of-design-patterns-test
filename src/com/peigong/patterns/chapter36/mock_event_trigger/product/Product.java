package com.peigong.patterns.chapter36.mock_event_trigger.product;

/**
 * @author: lilei
 * @create: 2020-05-25 15:10
 **/
public class Product implements Cloneable{

    private String name;

    Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Product clone() {
        try {
            return (Product)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
