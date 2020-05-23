package com.peigong.patterns.chapter32.chainofresponsibility_vs_observer.chain_of_responsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author: lilei
 * @create: 2020-05-23 13:53
 **/
public class Client {

    public static void main(String[] args) throws Exception{
        DnsServer sh = new SHDnsServer();
        DnsServer china = new ChinaDnsServer();
        DnsServer top = new TopDnsServer();
        sh.setUpperServer(china);
        china.setUpperServer(top);
        while (true) {
            System.out.println("请输入域名(输入n退出):");
            String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if ("n".equals(in.toLowerCase())) {
                return;
            }
            Recorder recorder = sh.resolve(in);
            System.out.println(recorder);
        }
    }

}
