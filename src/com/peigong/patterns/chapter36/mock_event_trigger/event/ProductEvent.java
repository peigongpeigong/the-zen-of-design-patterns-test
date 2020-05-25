package com.peigong.patterns.chapter36.mock_event_trigger.event;

import com.peigong.patterns.chapter36.mock_event_trigger.product.Product;

import java.util.Observable;

/**
 * @author: lilei
 * @create: 2020-05-25 15:10
 **/
public class ProductEvent extends Observable {

    private Product source;

    private EventType eventType;

    public ProductEvent(Product source) {
        this(source, EventType.CREATE);
    }

    public ProductEvent(Product source, EventType eventType) {
        this.source = source;
        this.eventType = eventType;
        notifyEventDispatcher();
    }

    public Product getSource() {
        return source;
    }

    public EventType getEventType() {
        return eventType;
    }

    private void notifyEventDispatcher(){
        addObserver(EventDispatcher.getInstance());
        setChanged();
        notifyObservers(source);
    }
}
