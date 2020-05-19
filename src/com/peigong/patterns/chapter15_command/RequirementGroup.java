package com.peigong.patterns.chapter15_command;

/**
 * @author: lilei
 * @create: 2020-05-19 11:15
 **/
public class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到需求组");
    }

    @Override
    public void add() {
        System.out.println("增加需求");
    }

    @Override
    public void delete() {
        System.out.println("删除需求");
    }

    @Override
    public void change() {
        System.out.println("改变需求");
    }

    @Override
    public void plan() {
        System.out.println("变更计划");
    }
}
