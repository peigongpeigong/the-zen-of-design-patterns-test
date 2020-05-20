package com.peigong.patterns.chapter24_memento;

/**
 * @author: lilei
 * @create: 2020-05-20 15:50
 **/
public class Memento {

    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
