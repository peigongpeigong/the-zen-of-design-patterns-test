package com.peigong.patterns.chapter26_state;

/**
 * @author: lilei
 * @create: 2020-05-21 14:10
 **/
public class RunState extends LiftState {

    @Override
    public void open(Lift lift) {
        System.out.println("*运行状态不能开门");
    }

    @Override
    public void close(Lift lift) {
        System.out.println("*运行状态们关着呢");
    }

    @Override
    public void run(Lift lift) {
        System.out.println("*已经运行了");
    }

    @Override
    public void stop(Lift lift) {
        System.out.println("电梯停止");
        lift.setCurrentState(Lift.STOP_STATE);
    }
}
