package com.peigong.patterns.chapter17_decorator;

/**
 * @author: lilei
 * @create: 2020-05-19 14:44
 **/
public class FatherTestDrive {

    public static void main(String[] args) {
        SchoolReport report = new ForthGradeSchoolReport();
        report = new HighScoreDecorator(report);
        report = new SortDecorator(report);
        report.report();
        report.sign("ok");
    }

}
