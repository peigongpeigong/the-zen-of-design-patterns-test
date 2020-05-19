package com.peigong.patterns.chapter15_command;

/**
 * @author: lilei
 * @create: 2020-05-19 11:22
 **/
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
