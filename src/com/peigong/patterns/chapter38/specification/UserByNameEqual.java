package com.peigong.patterns.chapter38.specification;

/**
 * @author: lilei
 * @create: 2020-05-25 16:47
 **/
public class UserByNameEqual extends CompositeSpecification {

    private String name;

    public UserByNameEqual(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getName().equals(name);
    }
}
