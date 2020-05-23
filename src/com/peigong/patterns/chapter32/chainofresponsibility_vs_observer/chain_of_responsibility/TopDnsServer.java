package com.peigong.patterns.chapter32.chainofresponsibility_vs_observer.chain_of_responsibility;

/**
 * @author: lilei
 * @create: 2020-05-23 13:53
 **/
public class TopDnsServer extends DnsServer {

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("TOP");
        return recorder;
    }

    @Override
    protected boolean isLocal(String domain) {
        return true;
    }
}
