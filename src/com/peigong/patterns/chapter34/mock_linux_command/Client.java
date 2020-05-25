package com.peigong.patterns.chapter34.mock_linux_command;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author: lilei
 * @create: 2020-05-25 11:35
 **/
public class Client {

    public static void main(String[] args) throws Exception{
        Invoker invoker = new Invoker();
        while (true) {
            System.out.println("#");
            String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if ("quit".equals(in) || "exit".equals(in)) {
                return;
            }
            System.out.println(invoker.exec(in));
        }
    }

}
