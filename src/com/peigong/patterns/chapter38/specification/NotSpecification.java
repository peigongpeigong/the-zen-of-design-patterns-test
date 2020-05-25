package com.peigong.patterns.chapter38.specification;

/**
 * @author: lilei
 * @create: 2020-05-25 17:04
 **/
public class NotSpecification extends CompositeSpecification {

    private UserSpecification specification;

    public NotSpecification(UserSpecification specification) {
        this.specification = specification;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return !specification.isSatisfiedBy(user);
    }
}
