package user.service;
import user.pojo.User;

public interface UserService {
    User findUserWhitUsername(String username);

    void userAlterPwd(String username,String password);
}
