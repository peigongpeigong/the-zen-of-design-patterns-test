package com.peigong.patterns.chapter32.command_vs_strategy.command;

/**
 * @author: lilei
 * @create: 2020-05-22 16:31
 **/
public class ZipDecompress extends AbstractCommand{

    public ZipDecompress(CompressAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void execute(String source, String dest) {
        algorithm.decompress(source, dest);
    }
}
