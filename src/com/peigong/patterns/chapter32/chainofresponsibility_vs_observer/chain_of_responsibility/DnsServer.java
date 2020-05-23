package com.peigong.patterns.chapter32.chainofresponsibility_vs_observer.chain_of_responsibility;

import java.util.Random;

/**
 * @author: lilei
 * @create: 2020-05-23 13:45
 **/
public abstract class DnsServer {

    private DnsServer upperServer;

    public final Recorder resolve(String domain) {
        Recorder recorder = null;
        if (isLocal(domain)) {
            recorder = echo(domain);
        }else{
            recorder = upperServer.resolve(domain);
        }
        return recorder;
    }

    protected abstract boolean isLocal(String domain);

    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        recorder.setIp(mockIpAddress());
        recorder.setDomain(domain);
        return recorder;
    }

    private String mockIpAddress() {
        Random random = new Random();
        String address = random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255);
        return address;
    }

    public DnsServer getUpperServer() {
        return upperServer;
    }

    public void setUpperServer(DnsServer upperServer) {
        this.upperServer = upperServer;
    }
}
