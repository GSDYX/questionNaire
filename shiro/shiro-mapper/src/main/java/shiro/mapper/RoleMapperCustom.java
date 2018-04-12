package shiro.mapper;



public interface RoleMapperCustom {
    //根据用户id查询权限权限
    String findRoleListByUserId(int userid)throws Exception;
}