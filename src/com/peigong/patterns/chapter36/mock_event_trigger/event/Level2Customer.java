package com.peigong.patterns.chapter36.mock_event_trigger.event;

import com.peigong.patterns.chapter36.mock_event_trigger.product.Product;

/**
 * @author: lilei
 * @create: 2020-05-25 15:27
 **/
public class Level2Customer extends EventCustomer {

    public Level2Customer(){
        super(EventType.DEL);
    }

    @Override
    public void exec(ProductEvent event) {
        Product source = event.getSource();
        System.out.println(source.getName() + "is delete, event:" + event.getEventType() + "@" + this.getClass().getSimpleName());
    }
}
