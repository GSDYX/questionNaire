package service;

import pojo.Admin;

public interface AdminLoginService {
    Admin findByName(String name) throws Exception;

    Admin findByAdminID(int adminId)throws Exception;
}
