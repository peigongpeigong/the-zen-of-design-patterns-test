package com.peigong.patterns.chapter32.chainofresponsibility_vs_observer.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * @author: lilei
 * @create: 2020-05-23 13:59
 **/
public abstract class DnsServer extends Observable implements Observer {

    public void update(Observable o, Object arg) {
        Recorder recorder = (Recorder) arg;
        if (isLocal(recorder)) {
            recorder.setIp(mockIpAddress());
        }else{
            responseFromUpperServer(recorder);
        }
        sign(recorder);
    }

    public void setUpperServer(DnsServer dnsServer) {
        deleteObservers();
        addObserver(dnsServer);
    }

    private void responseFromUpperServer(Recorder recorder) {
        setChanged();
        notifyObservers(recorder);
    }

    protected abstract void sign(Recorder recorder);

    protected abstract boolean isLocal(Recorder recorder);

    private String mockIpAddress() {
        Random random = new Random();
        String address = random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255);
        return address;
    }

}
