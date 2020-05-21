package com.peigong.patterns.chapter28_flyweight;

/**
 * @author: lilei
 * @create: 2020-05-21 16:05
 **/
public abstract class Chessman {

    public abstract String getColor();

    public void display(Coordinates coord) {
        System.out.println("棋子的颜色为：" + getColor() + "\t位置为：" + coord.getX() +"," + coord.getY());
    }

}
