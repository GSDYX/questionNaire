package shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import shiro.pojo.Permission;
import shiro.pojo.User;
import shiro.pojo.UserCustom;
import shiro.service.ShiroService;

import java.util.ArrayList;
import java.util.List;

public class CustomRealm extends AuthorizingRealm {

    //注入service
    @Autowired
    private ShiroService shiroService;

    // 设置realm的名称
    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }


    //realm的认证方法，从数据库查询用户信息
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token) throws AuthenticationException {

        // token是用户输入的用户名和密码 
        // 第一步从token中取出用户名
        String username = (String) token.getPrincipal();

        // 第二步：根据用户输入的username从数据库查询
        User user = null;
        try {
            user = shiroService.findUserByUsername(username);
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        // 如果查询不到返回null
        if(user==null){//
            return null;
        }
        // 从数据库查询到密码
        String password = user.getPassword();



        // 如果查询到返回认证信息AuthenticationInfo

        //UserCustom就是用户身份信息
        UserCustom userCustom = new UserCustom();

        userCustom.setUserid(user.getUserId());
        userCustom.setUsername(user.getUsername());




        //将UserCustom设置simpleAuthenticationInfo
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                userCustom, password, this.getName());

        return simpleAuthenticationInfo;
    }



    // 用于授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {

        //从 principals获取主身份信息
        //将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型），
        UserCustom userCustom =  (UserCustom) principals.getPrimaryPrincipal();

        //根据身份信息获取权限信息
        //从数据库获取到权限数据
        List<Permission> permissionList = null;
        try {
            permissionList = shiroService.findPermissionListByUserId(userCustom.getUserid());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //单独定一个集合对象 
        List<String> permissions = new ArrayList<String>();
        if(permissionList!=null){
            for(Permission permission:permissionList){
                //将数据库中的权限标签 符放入集合
                permissions.add(permission.getPermissionName());
            }
        }
		
		
	/*	List<String> permissions = new ArrayList<String>();
		permissions.add("user:create");//用户的创建
		permissions.add("item:query");//商品查询权限
		permissions.add("item:add");//商品添加权限
		permissions.add("item:edit");//商品修改权限
*/		//....

        //查到权限数据，返回授权信息(要包括 上边的permissions)
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //将上边查询到授权信息填充到simpleAuthorizationInfo对象中
        simpleAuthorizationInfo.addStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }





}
