package com.peigong.patterns.chapter34.mock_linux_command.command;


/**
 * @author: lilei
 * @create: 2020-05-25 10:53
 **/
public abstract class CommandName {

    private CommandName next;

    public final String handleMessage(CommandVO commandVO) {
        String result = "";
        if (commandVO.getParams().size() == 0 || commandVO.getParams().contains(getOperateParam())) {
            result = echo(commandVO);
        }else{
            if (next != null) {
                result = next.handleMessage(commandVO);
            }else{
                result = "无法执行";
            }
        }
        return result;
    }

    public void setNext(CommandName next) {
        this.next = next;
    }

    protected abstract String getOperateParam();

    protected abstract String echo(CommandVO commandVO);
}
