package shiro.service.impl;

import exception.ExceptionCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shiro.mapper.PermissionMapperCustom;
import shiro.mapper.UserMapper;
import shiro.pojo.Permission;
import shiro.pojo.User;
import shiro.pojo.UserCustom;
import shiro.pojo.UserExample;
import shiro.service.ShiroService;

import java.util.List;
@Service
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private UserMapper UserMapper;

    @Autowired
    private PermissionMapperCustom PermissionMapperCustom;

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
        Integer userid = user.getUserId();
        //根据用户id查询菜单


        //根据用户id查询权限url
        List<Permission> permissions = this.findPermissionListByUserId(userid);

        //认证通过，返回用户身份信息
        UserCustom userCustom = new UserCustom();
        userCustom.setUserid(user.getUserId());
        userCustom.setUsername(username);
        userCustom.setUsername(user.getUsername());//用户名称

        //放入权限范围的菜单和url
        userCustom.setPermissions(permissions);

        return userCustom;
    }

    @Override
    public User findUserByUsername(String username) throws Exception {
        UserExample UserExample = new UserExample();
        UserExample.Criteria criteria = UserExample.createCriteria();
        criteria.andUsernameEqualTo(username);

        List<User> list = UserMapper.selectByExample(UserExample);

        if(list!=null && list.size()==1){
            return list.get(0);
        }

        return null;
    }

    @Override
    public List<Permission> findPermissionListByUserId(Integer userid) throws Exception {
        return PermissionMapperCustom.findPermissionListByUserId(userid);
    }
}
