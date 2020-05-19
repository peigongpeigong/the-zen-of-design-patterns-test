package com.peigong.patterns.chapter15_command;

/**
 * @author: lilei
 * @create: 2020-05-19 11:18
 **/
public class UIGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到UI组");
    }

    @Override
    public void add() {
        System.out.println("UI组增加页面");
    }

    @Override
    public void delete() {
        System.out.println("UI组删除页面");
    }

    @Override
    public void change() {
        System.out.println("UI组修改页面");
    }

    @Override
    public void plan() {
        System.out.println("UI组调整计划");
    }
}
