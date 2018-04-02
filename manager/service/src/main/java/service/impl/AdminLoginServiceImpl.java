package service.impl;

import mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.AdminExample;
import service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public int findByName(String name) throws Exception {
        AdminExample adminExample = new AdminExample();
        //通过criteria构造查询条件
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminnameEqualTo("name");
        return adminMapper.countByExample(adminExample);
    }
}
