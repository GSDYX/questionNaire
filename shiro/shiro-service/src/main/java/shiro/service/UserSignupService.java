package shiro.service;

import shiro.pojo.User;

public interface UserSignupService {
    int usernameExist(User user);

    void userSignup(User user);
}
