package com.peigong.patterns.chapter15_command;

/**
 * @author: lilei
 * @create: 2020-05-19 11:26
 **/
public class CustomerTestDrive {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        UIGroup ui = new UIGroup();
        RequirementGroup requirement = new RequirementGroup();
        CodeGroup code = new CodeGroup();

        Command command = new AddRequirementCommand(code, ui, requirement);
        invoker.setCommand(command);
        invoker.action();
    }

}
