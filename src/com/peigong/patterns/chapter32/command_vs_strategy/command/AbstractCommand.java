package com.peigong.patterns.chapter32.command_vs_strategy.command;

/**
 * @author: lilei
 * @create: 2020-05-22 16:26
 **/
public abstract class AbstractCommand {

    protected CompressAlgorithm algorithm;

    public AbstractCommand(CompressAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public abstract void execute(String source, String dest);
}
