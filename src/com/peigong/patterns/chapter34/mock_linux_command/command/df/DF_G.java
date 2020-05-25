package com.peigong.patterns.chapter34.mock_linux_command.command.df;

import com.peigong.patterns.chapter34.mock_linux_command.DiskManager;
import com.peigong.patterns.chapter34.mock_linux_command.command.CommandVO;

/**
 * @author: lilei
 * @create: 2020-05-25 13:48
 **/
public class DF_G extends AbstractDF {
    @Override
    protected String getOperateParam() {
        return AbstractDF.G_PARAM;
    }

    @Override
    protected String echo(CommandVO commandVO) {
        return DiskManager.df_g();
    }
}
