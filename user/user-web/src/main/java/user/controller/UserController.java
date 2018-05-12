package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import user.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userAlterPwd")
    public String userAlterPwd(String password) {
        //        String username = (String) session.getAttribute("username");
        String username = "user";
        //根据用户名获取用户信息
        userService.userAlterPwd(username,password);
        return "userAlterSuccess";

    }
}
