package com.peigong.patterns.chapter36.mock_event_trigger.event;

public enum EventType {

    CREATE(1),
    EDIT(2),
    DEL(3),
    CLONE(4)
    ;

    EventType(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }
}
