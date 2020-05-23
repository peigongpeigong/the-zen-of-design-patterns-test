package com.peigong.patterns.chapter33.facade_vs_mediator.mediator;

/**
 * @author: lilei
 * @create: 2020-05-23 15:17
 **/
public class SalaryImpl extends AbstractColleague implements Salary {

    public SalaryImpl(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void increase() {
        mediator.up(this);

    }

    @Override
    public void decrease() {
        mediator.down(this);
    }
}
