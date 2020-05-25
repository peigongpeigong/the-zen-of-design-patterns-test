package com.peigong.patterns.chapter38.specification;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lilei
 * @create: 2020-05-25 17:07
 **/
public class Client {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("张三", 18));
        userList.add(new User("李三", 22));
        userList.add(new User("赵三", 24));
        userList.add(new User("王柳", 50));
        UserProvider provider = new UserProviderImpl();
        CompositeSpecification like = new UserByNameLike("%三%");
        CompositeSpecification age = new UserByAgeThan(20);
        List<User> ret = provider.findUser(userList, age.and(like));
        for (User user : ret) {
            System.out.println(user);
        }
    }

}
