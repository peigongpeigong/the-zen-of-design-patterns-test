package com.peigong.patterns.chapter19_adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lilei
 * @create: 2020-05-19 16:37
 **/
public class OuterUserInfoImpl implements OuterUserInfo {
    @Override
    public Map<String, String> getUserBaseInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("userName", "张三");
        map.put("mobileNumber", "1313131313");
        return map;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("officeTelNumber", "232323");
        map.put("jobPosition", "程序员");
        return map;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("homeTelNumber", "33333");
        map.put("homeAddress", "家庭住址xxx13号");
        return map;
    }
}
