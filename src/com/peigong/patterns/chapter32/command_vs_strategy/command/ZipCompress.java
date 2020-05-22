package com.peigong.patterns.chapter32.command_vs_strategy.command;

/**
 * @author: lilei
 * @create: 2020-05-22 16:30
 **/
public class ZipCompress extends AbstractCommand {

    public ZipCompress(CompressAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void execute(String source, String dest) {
        algorithm.compress(source, dest);
    }
}
