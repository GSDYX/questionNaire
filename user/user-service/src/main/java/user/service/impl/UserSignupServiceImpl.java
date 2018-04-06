package user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.mapper.UserMapper;
import user.pojo.User;
import user.pojo.UserExample;
import user.service.UserSignupService;
@Service
public class UserSignupServiceImpl implements UserSignupService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int usernameExist(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        int count = userMapper.countByExample(userExample);
        return count;
    }

    public void userSignup(User user){
        user.setUsername(user.getUsername());
        user.setUserpwd(user.getUserpwd());
        userMapper.insert(user);
    }
}
