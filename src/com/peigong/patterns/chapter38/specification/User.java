package com.peigong.patterns.chapter38.specification;

/**
 * @author: lilei
 * @create: 2020-05-25 16:45
 **/
public class User {

    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "用户名:" + name + "\t年龄:" + age;
    }
}
