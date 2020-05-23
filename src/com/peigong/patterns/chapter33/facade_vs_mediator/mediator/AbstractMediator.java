package com.peigong.patterns.chapter33.facade_vs_mediator.mediator;

/**
 * @author: lilei
 * @create: 2020-05-23 15:14
 **/
public abstract class AbstractMediator {

    protected final Salary salary;
    protected final Position position;
    protected final Tax tax;

    public AbstractMediator() {
        this.salary = new SalaryImpl(this);
        this.position = new PositionImpl(this);
        this.tax = new TaxImpl(this);
    }

    public Salary getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }

    public Tax getTax() {
        return tax;
    }

    public abstract void down(Position position);

    public abstract void up(Position position);

    public abstract void up(Salary salary);

    public abstract void down(Salary salary);

    public abstract void up(Tax tax);

    public abstract void down(Tax tax);
}
