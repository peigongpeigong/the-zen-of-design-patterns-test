package com.peigong.patterns.chapter19_adapter;

import java.util.Map;

public interface OuterUserInfo {

    Map<String,String> getUserBaseInfo();

    Map<String,String> getUserOfficeInfo();

    Map<String,String> getUserHomeInfo();

}
