package com.peigong.patterns.chapter32.chainofresponsibility_vs_observer.observer;

/**
 * @author: lilei
 * @create: 2020-05-23 14:05
 **/
public class ChinaDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("China");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".cn");
    }
}
