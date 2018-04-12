package shiro.service;

import shiro.pojo.Permission;
import shiro.pojo.User;
import shiro.pojo.UserCustom;

import java.util.List;

public interface ShiroService {

    //根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
    UserCustom authenticat(String username, String password) throws Exception;

    //根据用户账号查询用户信息
    User findUserByUsername(String username) throws Exception;

    //根据用户id查询权限
    List<Permission> findPermissionListByUserId(int userid) throws Exception;

    //     根据id查询角色
    String findRoleListByUserId(int userid) throws Exception;
}