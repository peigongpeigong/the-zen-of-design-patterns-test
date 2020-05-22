package com.peigong.patterns.chapter32.command_vs_strategy.command;

/**
 * @author: lilei
 * @create: 2020-05-22 16:32
 **/
public class GzipDecompress extends AbstractCommand {

    public GzipDecompress(CompressAlgorithm algorithm) {
        super(algorithm);
    }

    @Override
    public void execute(String source, String dest) {
        algorithm.decompress(source, dest);
    }
}
