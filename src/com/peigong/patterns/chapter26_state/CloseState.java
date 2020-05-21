package com.peigong.patterns.chapter26_state;

/**
 * @author: lilei
 * @create: 2020-05-21 14:09
 **/
public class CloseState extends LiftState{

    @Override
    public void open(Lift lift) {
        System.out.println("电梯门打开");
        lift.setCurrentState(Lift.OPEN_STATE);
    }

    @Override
    public void close(Lift lift) {
        System.out.println("*关门状态无法再关门");
    }

    @Override
    public void run(Lift lift) {
        System.out.println("电梯开始运行");
        lift.setCurrentState(Lift.RUN_STATE);
        lift.playAd();
    }

    @Override
    public void stop(Lift lift) {
        System.out.println("电梯停止");
        lift.setCurrentState(Lift.STOP_STATE);
    }
}
