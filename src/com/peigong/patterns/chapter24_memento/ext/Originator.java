package com.peigong.patterns.chapter24_memento.ext;

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
        Memento memento = new OrigMemento();
        memento.setState(this.state);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        setState(memento.getState());
    }

    private class OrigMemento implements Memento{

        private String state;

        @Override
        public String getState() {
            return state;
        }

        @Override
        public void setState(String state) {
            this.state = state;
        }
    }
}
