package com.peigong.patterns.chapter36.mock_event_trigger;

import com.peigong.patterns.chapter36.mock_event_trigger.event.EventDispatcher;
import com.peigong.patterns.chapter36.mock_event_trigger.event.Level1Customer;
import com.peigong.patterns.chapter36.mock_event_trigger.event.Level2Customer;
import com.peigong.patterns.chapter36.mock_event_trigger.event.Level3Customer;
import com.peigong.patterns.chapter36.mock_event_trigger.product.Product;
import com.peigong.patterns.chapter36.mock_event_trigger.product.ProductManager;

/**
 * @author: lilei
 * @create: 2020-05-25 15:14
 **/
public class Client {

    public static void main(String[] args) {
        EventDispatcher dispatcher = EventDispatcher.getInstance();
        dispatcher.registerCustomer(new Level1Customer());
        dispatcher.registerCustomer(new Level2Customer());
        dispatcher.registerCustomer(new Level3Customer());
        ProductManager manager = new ProductManager();
        Product product = manager.createProduct("铅笔");
        System.out.println("****************");
        manager.editProduct(product, "橡皮");
        System.out.println("****************");
        Product clone = manager.clone(product);
        System.out.println("****************");
        manager.abandonProduct(product);
    }

}
