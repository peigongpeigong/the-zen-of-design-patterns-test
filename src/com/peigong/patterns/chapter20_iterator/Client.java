package com.peigong.patterns.chapter20_iterator;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author: lilei
 * @create: 2020-05-20 10:54
 **/
public class Client {

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        Iterator iterator = new ConcreteIterator(vector);
        int i = 0;
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
            if (i==1) {
                iterator.remove();
            }
            i++;
        }
    }

}
