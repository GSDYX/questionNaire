package user.service;

import user.pojo.User;

public interface UserSignupService {
    int usernameExist(User user);

    void userSignup(User user);
}
