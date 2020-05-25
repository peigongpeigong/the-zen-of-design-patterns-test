package com.peigong.patterns.chapter38.specification;

/**
 * @author: lilei
 * @create: 2020-05-25 17:01
 **/
public abstract class CompositeSpecification implements UserSpecification {

    public UserSpecification and(UserSpecification specification) {
        return new AndSpecification(this, specification);
    }

    public UserSpecification or(UserSpecification specification) {
        return new OrSpecification(this, specification);
    }

    public UserSpecification not(UserSpecification specification) {
        return new NotSpecification(specification);
    }

}
