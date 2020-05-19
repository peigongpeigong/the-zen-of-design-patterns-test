package com.peigong.patterns.chapter17_decorator;

/**
 * @author: lilei
 * @create: 2020-05-19 14:40
 **/
public class ForthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长：");
        System.out.println("语文62，数学65，体育98，自然63");
        System.out.println("        家长签名");
    }

    @Override
    public void sign(String name) {
        System.out.println("签名：" + name);
    }
}
