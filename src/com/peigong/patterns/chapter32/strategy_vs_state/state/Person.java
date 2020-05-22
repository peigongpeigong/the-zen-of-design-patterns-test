package com.peigong.patterns.chapter32.strategy_vs_state.state;

/**
 * @author: lilei
 * @create: 2020-05-22 17:04
 **/
public class Person {

    public static final LifeState CHILD = new ChildrenState();
    public static final LifeState ADULT = new AdultState();
    public static final LifeState OLD = new OldState();

    private LifeState currentState;

    private int age;

    public Person() {
        age = 10;
        currentState = CHILD;
    }

    public void living(){
        currentState.living(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LifeState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(LifeState currentState) {
        this.currentState = currentState;
    }


}
