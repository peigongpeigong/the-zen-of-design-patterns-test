package com.peigong.patterns.chapter33.facade_vs_mediator.mediator;

/**
 * @author: lilei
 * @create: 2020-05-23 15:14
 **/
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
