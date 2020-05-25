package com.peigong.patterns.chapter38.specification;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lilei
 * @create: 2020-05-25 16:49
 **/
public class UserProviderImpl implements UserProvider {

    @Override
    public List<User> findUser(List<User> userList, UserSpecification specification) {
        List<User> resultList = new ArrayList<>();
        for (User user : userList) {
            if (specification.isSatisfiedBy(user)) {
                resultList.add(user);
            }
        }
        return resultList;
    }
}
