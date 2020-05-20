package com.peigong.patterns.chapter21_composite;

/**
 * @author: lilei
 * @create: 2020-05-20 13:23
 **/
public class Client {

    public static void main(String[] args) {
        Branch root = new Branch("BOSS", "老板", 1000);
        assembly(root);
        root.printInfo();
    }

    public static void assembly(Branch corp) {
        Branch b1 = new Branch("张三", "项目经理", 1000);
        Branch b2 = new Branch("李四", "财务主管", 1000);
        Branch b3 = new Branch("王二", "客服主管", 1000);
        corp.addSub(b1);
        corp.addSub(b2);
        corp.addSub(b3);
        b1.addSub(new Leaf("A","程序员",1000));
        b1.addSub(new Leaf("B","程序员",1000));
        b1.addSub(new Leaf("C","程序员",1000));
        b2.addSub(new Leaf("X","会计",1000));
        b2.addSub(new Leaf("Y","会计",1000));
        b3.addSub(new Leaf("G","客服",1000));
        b3.addSub(new Leaf("H","客服",1000));
    }

}
