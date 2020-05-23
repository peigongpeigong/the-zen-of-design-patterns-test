package com.peigong.patterns.chapter32.chainofresponsibility_vs_observer.observer;

/**
 * @author: lilei
 * @create: 2020-05-23 14:06
 **/
public class TopDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("TOP");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return true;
    }
}
