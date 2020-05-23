package com.peigong.patterns.chapter33.facade_vs_mediator.facade;

/**
 * @author: lilei
 * @create: 2020-05-23 15:34
 **/
public class SalaryProvider {


    private BasicSalary basicSalary;

    private Tax tax;

    private Bonus bonus;

    private Performance performance;

    public SalaryProvider(){
        tax = new Tax();
        basicSalary = new BasicSalary();
        bonus = new Bonus(new Attendance());
        performance = new Performance(basicSalary);
    }

    public int totalSalary(){
        return basicSalary.getBasicSalary() + bonus.getBonus() + performance.getPerformanceValue() - tax.getTax();
    }

}
