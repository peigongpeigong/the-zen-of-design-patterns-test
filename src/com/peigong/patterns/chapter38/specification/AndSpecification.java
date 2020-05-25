package com.peigong.patterns.chapter38.specification;

/**
 * @author: lilei
 * @create: 2020-05-25 17:02
 **/
public class AndSpecification extends CompositeSpecification {

    private UserSpecification left;
    private UserSpecification right;

    public AndSpecification(UserSpecification left, UserSpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) && right.isSatisfiedBy(user);
    }
}
