package com.peigong.patterns.chapter15_command;

/**
 * @author: lilei
 * @create: 2020-05-19 13:27
 **/
public class CancelDeletePageCommand extends Command {
    public CancelDeletePageCommand(CodeGroup code, UIGroup ui, RequirementGroup requirement) {
        super(code, ui, requirement);
    }

    @Override
    public void execute() {
        ui.undo();
    }
}
