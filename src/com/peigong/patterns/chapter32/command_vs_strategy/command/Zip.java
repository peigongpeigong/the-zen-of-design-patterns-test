package com.peigong.patterns.chapter32.command_vs_strategy.command;

/**
 * @author: lilei
 * @create: 2020-05-22 16:26
 **/
public class Zip implements CompressAlgorithm {
    @Override
    public boolean compress(String source, String dest) {
        System.out.println("zip compress["+source+"]->["+dest+"]");
        return true;
    }

    @Override
    public boolean decompress(String source, String dest) {
        System.out.println("zip decompress["+source+"]->["+dest+"]");
        return true;
    }
}
