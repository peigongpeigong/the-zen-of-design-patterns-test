package com.peigong.patterns.chapter38.specification;

import java.util.List;

public interface UserProvider {

    List<User> findUser(List<User> userList,UserSpecification specification);

}
