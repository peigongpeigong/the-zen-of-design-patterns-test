package com.peigong.patterns.chapter32.command_vs_strategy.strategy;

/**
 * @author: lilei
 * @create: 2020-05-22 16:19
 **/
public class Gzip implements CompressAlgorithm {
    @Override
    public boolean compress(String source, String dest) {
        System.out.println("gzip compress["+source+"]->["+dest+"]");
        return true;
    }

    @Override
    public boolean decompress(String source, String dest) {
        System.out.println("gzip decompress["+source+"]->["+dest+"]");
        return true;
    }
}
