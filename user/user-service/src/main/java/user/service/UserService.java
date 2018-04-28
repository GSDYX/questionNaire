package user.service;
import user.pojo.User;

public interface UserService {
    User findUserWhitUsername(String username);
}
