package com.peigong.patterns.chapter36.mock_event_trigger.event;

import oracle.jvm.hotspot.jfr.Producer;

import java.util.Vector;

/**
 * @author: lilei
 * @create: 2020-05-25 15:24
 **/
public abstract class EventCustomer {

    private Vector<EventType> types = new Vector<>();

    public EventCustomer(EventType eventType) {
        addType(eventType);
    }

    public void addType(EventType eventType) {
        types.add(eventType);
    }

    public Vector<EventType> getTypes() {
        return types;
    }

    public abstract void exec(ProductEvent event);
}
