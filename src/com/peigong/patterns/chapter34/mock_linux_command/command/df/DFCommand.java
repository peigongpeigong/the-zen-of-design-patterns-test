package com.peigong.patterns.chapter34.mock_linux_command.command.df;


import com.peigong.patterns.chapter34.mock_linux_command.command.Command;
import com.peigong.patterns.chapter34.mock_linux_command.command.CommandVO;

/**
 * @author: lilei
 * @create: 2020-05-25 13:48
 **/
public class DFCommand extends Command {
    @Override
    public String execute(CommandVO commandVO) {
        return buildChain(AbstractDF.class).get(0).handleMessage(commandVO);
    }
}
