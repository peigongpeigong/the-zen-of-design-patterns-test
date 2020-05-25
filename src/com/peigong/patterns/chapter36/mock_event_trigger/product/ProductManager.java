package com.peigong.patterns.chapter36.mock_event_trigger.product;

import com.peigong.patterns.chapter36.mock_event_trigger.event.EventType;
import com.peigong.patterns.chapter36.mock_event_trigger.event.ProductEvent;

/**
 * @author: lilei
 * @create: 2020-05-25 15:11
 **/
public class ProductManager {

    public Product createProduct(String name) {
        Product p = new Product(name);
        new ProductEvent(p);
        return p;
    }

    public void abandonProduct(Product product) {
        new ProductEvent(product, EventType.DEL);
    }

    public void editProduct(Product product, String name) {
        new ProductEvent(product, EventType.EDIT);
        product.setName(name);
    }

    public Product clone(Product product) {
        new ProductEvent(product, EventType.CLONE);
        return product.clone();
    }

}
