package com.peigong.patterns.chapter32.chainofresponsibility_vs_observer.chain_of_responsibility;

/**
 * @author: lilei
 * @create: 2020-05-23 13:50
 **/
public class ChinaDnsServer extends DnsServer {

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("CHINA");
        return recorder;
    }

    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }
}
