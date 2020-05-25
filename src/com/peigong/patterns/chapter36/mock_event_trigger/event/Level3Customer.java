package com.peigong.patterns.chapter36.mock_event_trigger.event;

import com.peigong.patterns.chapter36.mock_event_trigger.product.Product;

/**
 * @author: lilei
 * @create: 2020-05-25 15:27
 **/
public class Level3Customer extends EventCustomer {

    public Level3Customer(){
        super(EventType.EDIT);
        addType(EventType.CLONE);
    }

    @Override
    public void exec(ProductEvent event) {
        Product source = event.getSource();
        if (event.getEventType() == EventType.CLONE) {
            System.out.println(source.getName() + "is clone, event: " + event.getEventType() + "@" + this.getClass().getSimpleName());
        }else{
            System.out.println(source.getName() + "is edit, event:" + event.getEventType() + "@" + this.getClass().getSimpleName());
        }
    }
}
