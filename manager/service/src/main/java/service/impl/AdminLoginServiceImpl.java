package service.impl;

import mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Admin;
import pojo.AdminExample;
import service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

    @Autowired
    private AdminMapper adminMapper;

    public Admin findByName(String adminname) throws Exception {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminnameEqualTo(adminname);
        Admin admin = adminMapper.selectByExample(adminExample);
        return admin;
    }

    @Override
    public Admin findByAdminID(int adminId) throws Exception {
        Admin admin = adminMapper.selectByPrimaryKey(adminId);
        return admin;
    }
}
