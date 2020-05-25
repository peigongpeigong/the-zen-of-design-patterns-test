package com.peigong.patterns.chapter38.specification;

/**
 * @author: lilei
 * @create: 2020-05-25 16:53
 **/
public class UserByNameLike extends CompositeSpecification {

    private final static String LIKE_FLAG = "%";

    private String like;

    public UserByNameLike(String like) {
        this.like = like;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        String str = like.replace("%", "");
        if (like.startsWith(LIKE_FLAG) && !like.endsWith(LIKE_FLAG)) {
            return user.getName().startsWith(str);
        } else if (!like.startsWith(LIKE_FLAG) && like.endsWith(LIKE_FLAG)) {
            return user.getName().endsWith(str);
        }else{
            return user.getName().contains(str);
        }
    }
}
