package com.peigong.patterns.chapter22_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lilei
 * @create: 2020-05-20 13:57
 **/
public class HanFeiZiImpl implements HanFeiZi,Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void eating() {
        System.out.println("韩非子吃东西");
        notifyObservers("韩非子他吃着呢");
    }

    @Override
    public void sleeping() {
        System.out.println("韩非子睡了");
        notifyObservers("韩非子他睡了");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object obj) {
        for (Observer observer : observers) {
            observer.update(obj);
        }
    }
}
