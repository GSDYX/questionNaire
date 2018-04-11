package shiro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shiro.mapper.UserMapper;
import shiro.pojo.User;
import shiro.pojo.UserExample;
import shiro.service.UserSignupService;

@Service
public class UserSignupServiceImpl implements UserSignupService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int usernameExist(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        UserExample.Criteria criteria1 = criteria.andUsernameEqualTo(user.getUsername());
        int count = userMapper.countByExample(userExample);
        return count;
    }

    public void userSignup(User user){
        user.setUsername(user.getUsername());
        user.setPassword(user.getPassword());
        userMapper.insert(user);
    }
}
