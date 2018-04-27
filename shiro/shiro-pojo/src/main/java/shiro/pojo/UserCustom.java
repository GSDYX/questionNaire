package shiro.pojo;

import java.util.List;

public class UserCustom implements java.io.Serializable {
    private Integer userid;//用户id（主键）
    private String username;// 用户名称
    private List<Permission> permissions;// 权限

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }


    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }


}