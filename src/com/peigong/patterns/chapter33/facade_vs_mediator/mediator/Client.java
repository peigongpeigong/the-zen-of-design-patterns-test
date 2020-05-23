package com.peigong.patterns.chapter33.facade_vs_mediator.mediator;

/**
 * @author: lilei
 * @create: 2020-05-23 15:25
 **/
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        Position position = mediator.getPosition();
        position.promote();
    }

}
