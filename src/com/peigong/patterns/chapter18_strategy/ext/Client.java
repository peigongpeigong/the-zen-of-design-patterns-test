package com.peigong.patterns.chapter18_strategy.ext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author: lilei
 * @create: 2020-05-19 15:26
 **/
public class Client {

    public static void main(String[] args) throws Exception{
        System.out.println("请输入第一个数：\n");
        String a = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("输入的第一个数为：" + a);
        System.out.println("请输入符号：\n");
        String symbol = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("输入的符号为：" + symbol);
        System.out.println("请输入第二个数：\n");
        String b = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("输入的第二个数为：" + b);
        System.out.println("\n结果为：" + Calculator.get(symbol).exec(Integer.valueOf(a),Integer.valueOf(b)));
    }

}
