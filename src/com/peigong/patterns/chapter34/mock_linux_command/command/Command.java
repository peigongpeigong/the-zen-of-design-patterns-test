package com.peigong.patterns.chapter34.mock_linux_command.command;

import com.peigong.patterns.chapter34.mock_linux_command.ClassUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lilei
 * @create: 2020-05-25 11:15
 **/
public abstract class Command {
    public abstract String execute(CommandVO commandVO);

    protected final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass) {

        List<Class> classes = ClassUtil.getSonClass(abstractClass);
        List<CommandName> commandNameList = new ArrayList<>();
        for (Class clazz : classes) {
            CommandName commandName = null;
            try {
                commandName = (CommandName) Class.forName(clazz.getName()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (commandNameList.size() > 0) {
                commandNameList.get(commandNameList.size() - 1).setNext(commandName);
            }
            commandNameList.add(commandName);
        }
        return commandNameList;
    }

}
