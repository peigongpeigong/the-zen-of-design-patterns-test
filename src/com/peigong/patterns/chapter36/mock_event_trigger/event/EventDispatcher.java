package com.peigong.patterns.chapter36.mock_event_trigger.event;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * @author: lilei
 * @create: 2020-05-25 15:20
 **/
public class EventDispatcher implements Observer {

    private static EventDispatcher instance = new EventDispatcher();

    private Vector<EventCustomer> customers = new Vector<>();

    private EventDispatcher(){

    }

    public static EventDispatcher getInstance() {
        return instance;
    }

    @Override
    public void update(Observable o, Object arg) {
        ProductEvent event = (ProductEvent) o;
        for (EventCustomer customer : customers) {
            if (customer.getTypes().contains(((ProductEvent) o).getEventType())) {
                customer.exec(event);
            }
        }
    }

    public void registerCustomer(EventCustomer customer) {
        customers.add(customer);
    }
}
