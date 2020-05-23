package com.peigong.patterns.chapter32.chainofresponsibility_vs_observer.chain_of_responsibility;

/**
 * @author: lilei
 * @create: 2020-05-23 13:45
 **/
public class Recorder {

    private String domain;

    private String ip;

    private String owner;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String s = "域名：" + domain;
        s = s + "\nIP:" + ip;
        s = s + "\nowner:" + owner;
        return s;
    }
}
