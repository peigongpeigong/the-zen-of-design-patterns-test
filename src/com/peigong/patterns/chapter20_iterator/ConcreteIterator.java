package com.peigong.patterns.chapter20_iterator;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author: lilei
 * @create: 2020-05-20 10:52
 **/
public class ConcreteIterator implements Iterator {

    private Vector vector;

    private int cursor;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public boolean hasNext() {
        if (cursor >= vector.size()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return hasNext() ? vector.get(cursor++) : null;
    }

    @Override
    public void remove() {
        if ((cursor -1 ) < vector.size()) {
            vector.remove(--cursor);
        }
    }
}
