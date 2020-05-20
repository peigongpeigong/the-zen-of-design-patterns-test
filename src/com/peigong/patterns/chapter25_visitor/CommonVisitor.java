package com.peigong.patterns.chapter25_visitor;

/**
 * @author: lilei
 * @create: 2020-05-20 16:31
 **/
public class CommonVisitor implements Visitor {

    private int totalSalary;

    @Override
    public void visit(CommonEmployee employee) {
        System.out.println(getCommonEmployeeInfo(employee));
        totalSalary += employee.getSalary();
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(getManagerInfo(manager));
        totalSalary += manager.getSalary();
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.MALE ? "男" : "女") + "\t";
        info = info + "薪水：" + employee.getSalary();
        return info;
    }

    private String getManagerInfo(Manager manager) {
        String info = getBasicInfo(manager);
        info = info + "\t业绩：" + manager.getPerformance();
        return info;
    }

    private String getCommonEmployeeInfo(CommonEmployee employee) {
        String info = getBasicInfo(employee);
        info = info + "\t工作：" + employee.getJob();
        return info;
    }
}
