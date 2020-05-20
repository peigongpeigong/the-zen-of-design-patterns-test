package com.peigong.patterns.chapter24_memento.ext;

/**
 * @author: lilei
 * @create: 2020-05-20 15:51
 **/
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
