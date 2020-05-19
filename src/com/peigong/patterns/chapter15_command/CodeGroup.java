package com.peigong.patterns.chapter15_command;

/**
 * @author: lilei
 * @create: 2020-05-19 11:20
 **/
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到技术");
    }

    @Override
    public void add() {
        System.out.println("技术增加功能");
    }

    @Override
    public void delete() {
        System.out.println("技术删除功能");
    }

    @Override
    public void change() {
        System.out.println("技术调整功能");
    }

    @Override
    public void plan() {
        System.out.println("技术调整计划");
    }
}
