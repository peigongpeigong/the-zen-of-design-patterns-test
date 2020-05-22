package com.peigong.patterns.chapter32.command_vs_strategy.strategy;

public interface CompressAlgorithm {

    boolean compress(String source, String dest);

    boolean decompress(String source, String dest);

}
