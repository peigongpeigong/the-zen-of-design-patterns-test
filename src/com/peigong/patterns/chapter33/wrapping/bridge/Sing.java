package com.peigong.patterns.chapter33.wrapping.bridge;

/**
 * @author: lilei
 * @create: 2020-05-25 10:06
 **/
public class Sing implements Action {
    @Override
    public void act() {
        System.out.println("唱了个歌");
    }
}
