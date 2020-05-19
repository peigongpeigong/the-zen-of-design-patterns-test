package com.peigong.patterns.chapter17_decorator;

/**
 * @author: lilei
 * @create: 2020-05-19 14:42
 **/
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport report) {
        super(report);
    }

    private void reportHighScore(){
        System.out.println("本次考试语文最高75，数学78，自然80");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
