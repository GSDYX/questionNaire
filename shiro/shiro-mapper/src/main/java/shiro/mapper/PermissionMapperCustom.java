package shiro.mapper;

import shiro.pojo.Permission;

import java.util.List;

public interface PermissionMapperCustom {
    //根据用户id查询权限权限
    public List<Permission> findPermissionListByUserId(Integer userid)throws Exception;
}
