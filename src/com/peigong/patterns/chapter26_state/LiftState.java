package com.peigong.patterns.chapter26_state;

/**
 * @author: lilei
 * @create: 2020-05-21 14:00
 **/
public abstract class LiftState {

    public abstract void open(Lift lift);

    public abstract void close(Lift lift);

    public abstract void run(Lift lift);

    public abstract void stop(Lift lift);

}
