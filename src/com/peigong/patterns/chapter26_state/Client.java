package com.peigong.patterns.chapter26_state;

/**
 * @author: lilei
 * @create: 2020-05-21 14:26
 **/
public class Client {

    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.open();
        lift.close();
        lift.run();
        lift.open();
        lift.stop();
    }

}
