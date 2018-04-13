package manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import common.pojo.PageHelperResult;
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

    public PageHelperResult getUserList(int pageNumber, int pageSize) {
        //查询商品列表
        UserExample example = new UserExample();
        //分页处理
        PageHelper.startPage(pageNumber, pageSize);
        List<User> list = userMapper.selectByExample(example);
        //创建一个返回值对象
        PageHelperResult result = new PageHelperResult();
        result.setRows(list);
        //取记录总条数
        PageInfo<User> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }
}
