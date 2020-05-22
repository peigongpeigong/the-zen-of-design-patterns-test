package com.peigong.patterns.chapter32.strategy_vs_state.state;

/**
 * @author: lilei
 * @create: 2020-05-22 17:05
 **/
public class ChildrenState implements LifeState {
    @Override
    public void living(Person person) {
        if (person.getAge() < 20) {
            System.out.println("年龄"+person.getAge()+",在学习");
            person.setAge(person.getAge() + 3);
        }else{
            person.setCurrentState(Person.ADULT);
        }
        person.living();
    }
}
