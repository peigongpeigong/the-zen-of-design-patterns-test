package com.peigong.patterns.chapter15_command;

/**
 * @author: lilei
 * @create: 2020-05-19 11:14
 **/
public abstract class Group {

    public abstract void find();

    public abstract void add();

    public abstract void delete();

    public abstract void change();

    public abstract void plan();

    public void undo(){

    }

}
