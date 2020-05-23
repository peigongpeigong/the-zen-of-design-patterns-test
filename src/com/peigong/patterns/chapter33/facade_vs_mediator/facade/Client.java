package com.peigong.patterns.chapter33.facade_vs_mediator.facade;

/**
 * @author: lilei
 * @create: 2020-05-23 15:39
 **/
public class Client {

    public static void main(String[] args) {
        SalaryProvider provider = new SalaryProvider();

        System.out.println(provider.totalSalary());
    }

}
