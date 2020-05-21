package com.peigong.patterns.chapter26_state;

/**
 * @author: lilei
 * @create: 2020-05-21 14:01
 **/
public class Lift {

    public static final LiftState OPEN_STATE = new OpenState();
    public static final LiftState CLOSE_STATE = new CloseState();
    public static final LiftState STOP_STATE = new StopState();
    public static final LiftState RUN_STATE = new RunState();

    private LiftState currentState;

    public Lift() {
        currentState = STOP_STATE;
    }

    public void open(){
        currentState.open(this);
    }

    public void close() {
        currentState.close(this);
    }

    public void run() {
        currentState.run(this);
    }

    public void stop(){
        currentState.stop(this);
    }

    public void playAd(){
        System.out.println("开始播放广告");
    }

    public LiftState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(LiftState currentState) {
        this.currentState = currentState;
    }
}
