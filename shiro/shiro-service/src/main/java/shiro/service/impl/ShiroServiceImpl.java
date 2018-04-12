package shiro.service.impl;

import exception.ExceptionCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shiro.mapper.PermissionMapperCustom;
import shiro.mapper.RoleMapperCustom;
import shiro.mapper.UserMapper;
import shiro.pojo.*;
import shiro.service.ShiroService;

import java.util.List;
@Service
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PermissionMapperCustom permissionMapperCustom;
    @Autowired
    private RoleMapperCustom roleMapperCustom;

    @Override
    public UserCustom authenticat(String username, String password) throws Exception {
        //根据用户账号查询数据库
        User user = this.findUserByUsername(username);

        if(user == null){
            //抛出异常
            throw new ExceptionCustom("用户账号不存在");
        }

        //数据库密码 (md5密码 )
        String password_db = user.getPassword();

        //对输入的密码 和数据库密码 进行比对，如果一致，认证通过

        if(!password.equalsIgnoreCase(password_db)){
            //抛出异常
            throw new ExceptionCustom("用户名或密码 错误");
        }
        //得到用户id
        Integer userid = user.getUserid();



        //根据用户id查询权限
        List<Permission> permissions = this.findPermissionListByUserId(userid);

        //认证通过，返回用户身份信息
        UserCustom userCustom = new UserCustom();
        userCustom.setUserid(user.getUserid());
        userCustom.setUsername(username);
        userCustom.setUsername(user.getUsername());//用户名称

        //放入权限范围的菜单和url
        userCustom.setPermissions(permissions);

        return userCustom;
    }
//根据用户名获取用户信息
    @Override
    public User findUserByUsername(String username) throws Exception {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);

        List<User> list = userMapper.selectByExample(userExample);

        if(list!=null && list.size()==1){
            return list.get(0);
        }

        return null;
    }
//    根据id获取权限信息

    @Override
    public List<Permission> findPermissionListByUserId(int userid) throws Exception {
        return permissionMapperCustom.findPermissionListByUserId(userid);
    }

    @Override
    public String findRoleListByUserId(int userid) throws Exception {
        return roleMapperCustom.findRoleListByUserId(userid);
    }
}
