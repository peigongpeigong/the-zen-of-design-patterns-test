package com.peigong.patterns.chapter16_chainofresponsibility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: lilei
 * @create: 2020-05-19 14:14
 **/
public class Client {

    public static void main(String[] args) {
        Random random = new Random();
        List<Women> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new WomenImpl(random.nextInt(4), "逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);

        for (Women women : list) {
            System.out.println("\n" + women.getType() + " " + women.getRequest());
            father.handleMessage(women);
            System.out.println();
        }
    }

}
