package com.peigong.patterns.chapter33.wrapping.decorator;

/**
 * @author: lilei
 * @create: 2020-05-25 09:43
 **/
public class HotAir extends ActDecorator {

    public HotAir(Superstar superstar) {
        super(superstar);
    }

    @Override
    public void act() {
        System.out.println("我演戏老好了");
        super.act();
    }
}
