package com.peigong.patterns.chapter32.command_vs_strategy.command;

/**
 * @author: lilei
 * @create: 2020-05-22 16:32
 **/
public class Client {

    public static void main(String[] args) {
        AbstractCommand cmd = new GzipCompress(new Gzip());
        cmd.execute("/data1/logs/", "/data1/backup/logs.gz");
        cmd = new GzipDecompress(new Gzip());
        cmd.execute("/data1/backup/logs.gz","/data1/backup/logs");
    }

}
