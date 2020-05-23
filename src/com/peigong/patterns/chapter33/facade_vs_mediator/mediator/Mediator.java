package com.peigong.patterns.chapter33.facade_vs_mediator.mediator;

/**
 * @author: lilei
 * @create: 2020-05-23 15:21
 **/
public class Mediator extends AbstractMediator {
    @Override
    public void down(Position position) {
        downPosition();
        downSalary();
        downTax();
    }

    @Override
    public void up(Position position) {
        upPosition();
        upSalary();
        upTax();
    }

    @Override
    public void up(Salary salary) {
        upSalary();
        upTax();
    }

    @Override
    public void down(Salary salary) {
        downSalary();
        downTax();
    }

    @Override
    public void up(Tax tax) {
        upTax();
    }

    @Override
    public void down(Tax tax) {
        downTax();
    }

    private void upSalary() {
        System.out.println("涨工资");
    }

    private void upTax() {
        System.out.println("税涨了");
    }

    private void upPosition() {
        System.out.println("升职了");
    }

    private void downSalary(){
        System.out.println("工资降了");
    }

    private void downTax(){
        System.out.println("税降了");
    }

    private void downPosition(){
        System.out.println("降职了");
    }
}
