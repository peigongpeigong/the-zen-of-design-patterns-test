package com.peigong.patterns.chapter15_command;

/**
 * @author: lilei
 * @create: 2020-05-19 11:21
 **/
public abstract class Command {

    protected CodeGroup code;

    protected UIGroup ui;

    protected RequirementGroup requirement;

    public Command(CodeGroup code, UIGroup ui, RequirementGroup requirement) {
        this.code = code;
        this.ui = ui;
        this.requirement = requirement;
    }

    public abstract void execute();
}
