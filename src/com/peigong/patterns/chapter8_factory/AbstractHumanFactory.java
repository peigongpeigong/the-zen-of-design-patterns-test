package com.peigong.patterns.chapter8_factory;

/**
 * @author: lilei
 * @create: 2020-05-17 14:54
 **/
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> clazz);

}
