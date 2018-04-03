package portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portal.mapper.UserMapper;
import portal.pojo.User;
import portal.pojo.UserExample;
import portal.service.UserLoginService;
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int userLogin(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andUserpwdEqualTo(user.getUserpwd());
        int count=userMapper.countByExample(userExample);
        return count;
    }

}
