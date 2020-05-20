package com.peigong.patterns.chapter22_observer;

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(Object obj);

}
