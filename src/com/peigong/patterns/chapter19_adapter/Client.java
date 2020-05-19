package com.peigong.patterns.chapter19_adapter;

/**
 * @author: lilei
 * @create: 2020-05-19 16:41
 **/
public class Client {

    public static void main(String[] args) {
        OuterUserInfo outerUserInfo = new OuterUserInfoImpl();
        UserInfo adapter = new OuterUserInfoAdapter(outerUserInfo);
        printUserInfo(adapter);
    }

    public static void printUserInfo(UserInfo userInfo) {
        System.out.println(userInfo.getUsername());
        System.out.println(userInfo.getHomeAddress());
    }
}
