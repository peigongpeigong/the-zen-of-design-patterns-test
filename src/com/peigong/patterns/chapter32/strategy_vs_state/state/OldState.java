package com.peigong.patterns.chapter32.strategy_vs_state.state;

/**
 * @author: lilei
 * @create: 2020-05-22 17:06
 **/
public class OldState implements LifeState {
    @Override
    public void living(Person person) {
        if (person.getAge() < 100) {
            System.out.println("年龄"+person.getAge()+",在养老");
            person.setAge(person.getAge() + 5);
            person.living();
        }else{
            System.out.println("死了");
        }
    }
}
