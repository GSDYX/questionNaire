package shiro.mapper;

import shiro.pojo.Permission;

import java.util.List;

public interface PermissionMapperCustom {
    //根据用户id查询权限权限
     List<Permission> findPermissionListByUserId(int userid)throws Exception;
}
