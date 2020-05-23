package com.peigong.patterns.chapter33.facade_vs_mediator.mediator;

/**
 * @author: lilei
 * @create: 2020-05-23 15:19
 **/
public class TaxImpl extends AbstractColleague implements Tax {

    public TaxImpl(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void up() {
        mediator.up(this);
    }

    @Override
    public void down() {
        mediator.down(this);
    }
}
