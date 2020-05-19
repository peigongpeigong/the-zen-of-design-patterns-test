package com.peigong.patterns.chapter18_strategy;

/**
 * @author: lilei
 * @create: 2020-05-19 15:07
 **/
public class GivenGreenLight implements Strategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯");
    }
}
