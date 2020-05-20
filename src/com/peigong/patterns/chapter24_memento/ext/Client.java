package com.peigong.patterns.chapter24_memento.ext;

/**
 * @author: lilei
 * @create: 2020-05-20 15:52
 **/
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("before");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("after");
        System.out.println("current state : " + originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("restore state : " + originator.getState());
    }

}
