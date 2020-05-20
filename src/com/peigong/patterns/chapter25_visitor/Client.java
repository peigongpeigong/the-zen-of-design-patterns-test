package com.peigong.patterns.chapter25_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lilei
 * @create: 2020-05-20 16:35
 **/
public class Client {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        assembly(list);
        Visitor visitor = new CommonVisitor();
        TotalVisitor totalVisitor = new TotalSalaryVisitor();
        ShowVisitor showVisitor = new InfoShowVisitor();
        for (Employee employee : list) {
            employee.accept(visitor);
            employee.accept(totalVisitor);
            employee.accept(showVisitor);
        }
        System.out.println("****************************************");
        showVisitor.report();
        System.out.println("totalSalary:" + totalVisitor.getTotalSalary());
    }

    public static void assembly(List<Employee> list) {
        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.setName("张三");
        commonEmployee.setSalary(Employee.MALE);
        commonEmployee.setSalary(3000);
        commonEmployee.setJob("技术");
        list.add(commonEmployee);
        commonEmployee = new CommonEmployee();
        commonEmployee.setName("李斯");
        commonEmployee.setSalary(Employee.FEMALE);
        commonEmployee.setSalary(3000);
        commonEmployee.setJob("美工");
        list.add(commonEmployee);
        Manager manager = new Manager();
        manager.setName("王五");
        manager.setSalary(5000);
        manager.setSex(Employee.MALE);
        manager.setPerformance("一般吧");
        list.add(manager);
    }

}
