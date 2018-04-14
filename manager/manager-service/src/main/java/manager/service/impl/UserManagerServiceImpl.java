package manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import manager.mapper.UserMapper;
import manager.pojo.User;
import manager.pojo.UserExample;
import manager.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagerServiceImpl implements UserManagerService {

    @Autowired
    private UserMapper userMapper;

    public PageInfo getUserList(int pageNum,int pageSize) {
        //查询商品列表
        UserExample example = new UserExample();
        //分页处理
        PageHelper.startPage(pageNum, pageSize);
        List<User> list = userMapper.selectByExample(example);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
