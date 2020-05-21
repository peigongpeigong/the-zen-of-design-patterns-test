package com.peigong.patterns.chapter27_interpreter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: lilei
 * @create: 2020-05-21 15:05
 **/
public class Client {

    public static void main(String[] args) throws Exception{
        String exp = getExpressionString();
        Map<String, Integer> varMap = getValue(exp);
        Calculator cal = new Calculator(exp);
        int result = cal.calculate(varMap);
        System.out.println("运算结果为：" + result);
    }

    public static String getExpressionString() throws Exception{
        System.out.println("请输入表达式：");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static Map<String, Integer> getValue(String expStr) throws Exception{
        Map<String, Integer> var = new HashMap<>();
        char[] chars = expStr.toCharArray();
        for (char ch : chars) {
            if (ch != '+' && ch != '-') {
                if (!var.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入" + ch + "的值:");
                    String val = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    var.put(String.valueOf(ch), Integer.valueOf(val));
                }
            }
        }
        return var;
    }

}
