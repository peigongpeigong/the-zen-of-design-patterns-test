package com.peigong.patterns.chapter26_state;

/**
 * @author: lilei
 * @create: 2020-05-21 14:08
 **/
public class OpenState extends LiftState {

    @Override
    public void open(Lift lift) {
        System.out.println("*门已开，无法继续打开");
    }

    @Override
    public void close(Lift lift) {
        System.out.println("电梯门关闭");
        lift.setCurrentState(Lift.CLOSE_STATE);
    }

    @Override
    public void run(Lift lift) {
        System.out.println("*开门状态不能动");
    }

    @Override
    public void stop(Lift lift) {
        System.out.println("*开门状态不能停");
    }
}
