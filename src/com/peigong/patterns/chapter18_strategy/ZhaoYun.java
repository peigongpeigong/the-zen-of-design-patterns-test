package com.peigong.patterns.chapter18_strategy;

/**
 * @author: lilei
 * @create: 2020-05-19 15:08
 **/
public class ZhaoYun {

    public static void main(String[] args) {
        Context context = null;
        System.out.println("第一个锦囊");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("第二个锦囊");
        context.setStrategy(new GivenGreenLight());
        context.operate();
        System.out.println("第三个锦囊");
        context.setStrategy(new BlockEnemy());
        context.operate();
    }

}
