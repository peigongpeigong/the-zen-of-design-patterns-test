package com.peigong.patterns.chapter33.facade_vs_mediator.facade;

/**
 * @author: lilei
 * @create: 2020-05-23 15:32
 **/
public class Bonus {

    private Attendance attendance;

    public Bonus(Attendance attendance) {
        this.attendance = attendance;
    }

    public int getBonus(){
        int workDays = attendance.getWorkDays();
        return workDays * 1800 / 30;
    }
}
