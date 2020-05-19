package com.peigong.patterns.chapter15_command;

/**
 * @author: lilei
 * @create: 2020-05-19 11:24
 **/
public class DeletePageCommand extends Command {

    public DeletePageCommand(CodeGroup code, UIGroup ui, RequirementGroup requirement) {
        super(code, ui, requirement);
    }

    @Override
    public void execute() {
        ui.find();
        ui.delete();
        ui.plan();
    }
}
