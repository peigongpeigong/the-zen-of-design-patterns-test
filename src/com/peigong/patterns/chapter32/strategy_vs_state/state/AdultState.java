package com.peigong.patterns.chapter32.strategy_vs_state.state;

/**
 * @author: lilei
 * @create: 2020-05-22 17:05
 **/
public class AdultState implements LifeState {

    @Override
    public void living(Person person) {
        if (person.getAge() < 60) {
            System.out.println("年龄"+person.getAge()+",在工作");
            person.setAge(person.getAge() + 10);
        }else{
            person.setCurrentState(Person.OLD);
        }
        person.living();
    }
}
