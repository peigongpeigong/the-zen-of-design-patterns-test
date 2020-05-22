package com.peigong.patterns.chapter32.command_vs_strategy.strategy;

/**
 * @author: lilei
 * @create: 2020-05-22 16:20
 **/
public class CompressTool {

    private CompressAlgorithm algorithm;

    public CompressTool() {
        algorithm = new Zip();
    }

    public void setAlgorithm(CompressAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void compress(String source, String dest) {
        algorithm.compress(source, dest);
    }

    public void decompress(String source, String dest) {
        algorithm.decompress(source, dest);
    }
}

