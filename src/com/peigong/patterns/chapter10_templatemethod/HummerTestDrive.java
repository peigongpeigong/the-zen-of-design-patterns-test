package com.peigong.patterns.chapter10_templatemethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author: lilei
 * @create: 2020-05-18 10:50
 **/
public class HummerTestDrive {

    public static void main(String[] args) throws Exception{
        System.out.println("Hummer H1");
        System.out.println("H1是否响喇叭 ,Y/N ?");
        String ret = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HummerH1Model h1 = new HummerH1Model();
        if(!"Y".equals(ret.toUpperCase())){
            h1.setAlarm(false);
        }
        h1.run();

        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }

}
