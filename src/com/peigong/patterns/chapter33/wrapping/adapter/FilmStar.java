package com.peigong.patterns.chapter33.wrapping.adapter;

/**
 * @author: lilei
 * @create: 2020-05-25 09:52
 **/
public class FilmStar implements Superstar {
    @Override
    public void act() {
        System.out.println("明星演言情戏");
    }
}
