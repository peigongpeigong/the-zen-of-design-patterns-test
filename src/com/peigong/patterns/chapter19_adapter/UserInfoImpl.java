package com.peigong.patterns.chapter19_adapter;

/**
 * @author: lilei
 * @create: 2020-05-19 16:34
 **/
public class UserInfoImpl implements UserInfo {
    @Override
    public String getUsername() {
        System.out.println("getUsername");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("getHomeAddress");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("getMobileNumber");
        return null;
    }

    @Override
    public String getOfficeTelNum() {
        System.out.println("getOfficeTelNum");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("getJobPosition");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("getHomeTelNumber");
        return null;
    }
}
