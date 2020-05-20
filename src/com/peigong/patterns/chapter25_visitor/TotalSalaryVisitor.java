package com.peigong.patterns.chapter25_visitor;

/**
 * @author: lilei
 * @create: 2020-05-20 17:01
 **/
public class TotalSalaryVisitor implements TotalVisitor {

    private int total;

    @Override
    public int getTotalSalary() {
        return total;
    }

    @Override
    public void visit(CommonEmployee employee) {
        total += employee.getSalary();
    }

    @Override
    public void visit(Manager manager) {
        total += manager.getSalary();
    }
}
