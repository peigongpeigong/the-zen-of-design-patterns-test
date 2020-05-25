package com.peigong.patterns.chapter33.wrapping.bridge;

/**
 * @author: lilei
 * @create: 2020-05-25 10:05
 **/
public class ActFilm implements Action{
    @Override
    public void act() {
        System.out.println("演了个戏");
    }
}
