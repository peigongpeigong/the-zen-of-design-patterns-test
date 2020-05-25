package com.peigong.patterns.chapter34.mock_linux_command.command.df;

import com.peigong.patterns.chapter34.mock_linux_command.DiskManager;
import com.peigong.patterns.chapter34.mock_linux_command.command.CommandVO;

/**
 * @author: lilei
 * @create: 2020-05-25 13:47
 **/
public class DF_K extends AbstractDF {
    @Override
    protected String getOperateParam() {
        return AbstractDF.K_PARAM;
    }

    @Override
    protected String echo(CommandVO commandVO) {
        return DiskManager.df_k();
    }
}
