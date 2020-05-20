package com.peigong.patterns.chapter25_visitor;

/**
 * @author: lilei
 * @create: 2020-05-20 16:58
 **/
public class InfoShowVisitor implements ShowVisitor{

    private String info = "";

    @Override
    public void visit(CommonEmployee employee) {
        info = info + getCommonEmployeeInfo(employee) + "\n";
    }

    @Override
    public void visit(Manager manager) {
        info = info + getManagerInfo(manager) + "\n";
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

    @Override
    public void report() {
        System.out.println(info);
    }
}
