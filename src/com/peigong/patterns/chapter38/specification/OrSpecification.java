package com.peigong.patterns.chapter38.specification;

/**
 * @author: lilei
 * @create: 2020-05-25 17:03
 **/
public class OrSpecification extends CompositeSpecification {

    private UserSpecification left;
    private UserSpecification right;

    public OrSpecification(UserSpecification left, UserSpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) || right.isSatisfiedBy(user);
    }
}
