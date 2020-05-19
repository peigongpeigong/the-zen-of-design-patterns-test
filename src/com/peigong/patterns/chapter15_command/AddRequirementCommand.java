package com.peigong.patterns.chapter15_command;

/**
 * @author: lilei
 * @create: 2020-05-19 11:23
 **/
public class AddRequirementCommand extends Command {

    public AddRequirementCommand(CodeGroup code, UIGroup ui, RequirementGroup requirement) {
        super(code, ui, requirement);
    }

    @Override
    public void execute() {
        requirement.find();
        requirement.add();
        requirement.plan();
        ui.add();
        code.add();
    }
}
