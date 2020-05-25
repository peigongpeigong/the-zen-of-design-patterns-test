package com.peigong.patterns.chapter34.mock_linux_command;

import com.peigong.patterns.chapter34.mock_linux_command.command.Command;
import com.peigong.patterns.chapter34.mock_linux_command.command.CommandEnum;
import com.peigong.patterns.chapter34.mock_linux_command.command.CommandVO;

/**
 * @author: lilei
 * @create: 2020-05-25 11:31
 **/
public class Invoker {

    public String exec(String commandStr) {
        String result = "";
        CommandVO vo = new CommandVO(commandStr);
        if (CommandEnum.getNames().contains(vo.getCommandName())) {
            String className = CommandEnum.valueOf(vo.getCommandName()).getValue();
            Command command = null;
            try {
                command = (Command) Class.forName(className).newInstance();
                result = command.execute(vo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            result = "无法执行";
        }
        return result;
    }

}
