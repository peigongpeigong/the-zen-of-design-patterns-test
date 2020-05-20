package com.peigong.patterns.chapter21_composite;

/**
 * @author: lilei
 * @create: 2020-05-20 11:28
 **/
public abstract class Corp {

    private String name = "";
    private String position = "";
    private int salary;

    private Corp parent;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(name + "\t职位：" + position + "\t工资" + salary);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }

    public Corp getParent() {
        return parent;
    }
}
