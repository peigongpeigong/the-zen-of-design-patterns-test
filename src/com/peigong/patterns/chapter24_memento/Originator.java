package com.peigong.patterns.chapter24_memento;

/**
 * @author: lilei
 * @create: 2020-05-20 15:50
 **/
public class Originator {

    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        setState(memento.getState());
    }
}
