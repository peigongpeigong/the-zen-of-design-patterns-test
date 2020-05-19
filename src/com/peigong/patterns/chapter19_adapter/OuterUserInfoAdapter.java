package com.peigong.patterns.chapter19_adapter;

/**
 * @author: lilei
 * @create: 2020-05-19 16:39
 **/
public class OuterUserInfoAdapter implements UserInfo {

    private OuterUserInfo outerUserInfo;

    public OuterUserInfoAdapter(OuterUserInfo outerUserInfo) {
        this.outerUserInfo = outerUserInfo;
    }

    @Override
    public String getUsername() {
        return outerUserInfo.getUserBaseInfo().get("userName");
    }

    @Override
    public String getHomeAddress() {
        return outerUserInfo.getUserHomeInfo().get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        return outerUserInfo.getUserBaseInfo().get("mobileNumber");
    }

    @Override
    public String getOfficeTelNum() {
        return outerUserInfo.getUserOfficeInfo().get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        return outerUserInfo.getUserOfficeInfo().get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        return outerUserInfo.getUserHomeInfo().get("homeTelNumber");
    }
}
