package manager.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import manager.mapper.UserMapper;
import manager.pojo.User;
import manager.pojo.UserExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestPageHelper {
    @Test
    public void testPageHelper() {
        //创建一个spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        //从spring容器中获得Mapper的代理对象
        UserMapper mapper = applicationContext.getBean(UserMapper.class);
        //执行查询，并分页
        UserExample example = new UserExample();
        //分页处理
        PageHelper.startPage(2, 10);
        List<User> list = mapper.selectByExample(example);
        //取商品列表
        for (User user : list) {
            System.out.println(user.getUsername());
        }
        //取分页信息
        PageInfo<User> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        System.out.println("用户"+ total);

    }
}

