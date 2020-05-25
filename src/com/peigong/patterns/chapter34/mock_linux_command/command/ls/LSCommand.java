package com.peigong.patterns.chapter34.mock_linux_command.command.ls;

import com.peigong.patterns.chapter34.mock_linux_command.command.Command;
import com.peigong.patterns.chapter34.mock_linux_command.command.CommandName;
import com.peigong.patterns.chapter34.mock_linux_command.command.CommandVO;

/**
 * @author: lilei
 * @create: 2020-05-25 11:30
 **/
public class LSCommand extends Command {
    @Override
    public String execute(CommandVO commandVO) {
        CommandName firstNode = buildChain(AbstractLS.class).get(0);
        return firstNode.handleMessage(commandVO);
    }
}
