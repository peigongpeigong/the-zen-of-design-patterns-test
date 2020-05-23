package com.peigong.patterns.chapter32.chainofresponsibility_vs_observer.chain_of_responsibility;

/**
 * @author: lilei
 * @create: 2020-05-23 13:50
 **/
public class SHDnsServer extends DnsServer {

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("SH");
        return recorder;
    }

    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith("sh.cn");
    }
}
