package com.peigong.patterns.chapter32.command_vs_strategy.strategy;

/**
 * @author: lilei
 * @create: 2020-05-22 16:21
 **/
public class Client {

    public static void main(String[] args) {
        CompressTool tool = new CompressTool();
        tool.compress("d:/data1/logs", "d:/data1/logs.zip");
        tool.setAlgorithm(new Gzip());
        tool.compress("/data1/logs/","/data1/logs.gz");
    }

}
