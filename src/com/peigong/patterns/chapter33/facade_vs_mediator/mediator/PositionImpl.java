package com.peigong.patterns.chapter33.facade_vs_mediator.mediator;

/**
 * @author: lilei
 * @create: 2020-05-23 15:15
 **/
public class PositionImpl extends AbstractColleague implements Position {

    public PositionImpl(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void promote() {
        mediator.up(this);
    }

    @Override
    public void demote() {
        mediator.down(this);
    }
}
