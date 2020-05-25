package com.peigong.patterns.chapter34.mock_linux_command.command.ls;

import com.peigong.patterns.chapter34.mock_linux_command.FileManager;
import com.peigong.patterns.chapter34.mock_linux_command.command.CommandVO;

/**
 * @author: lilei
 * @create: 2020-05-25 11:14
 **/
public class LS_A extends AbstractLS {
    @Override
    protected String getOperateParam() {
        return AbstractLS.A_PARAM;
    }

    @Override
    protected String echo(CommandVO commandVO) {
        return FileManager.ls_a(commandVO.formatData());
    }

}
