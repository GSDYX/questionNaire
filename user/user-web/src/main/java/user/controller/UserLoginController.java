package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import user.pojo.User;
import user.service.UserLoginService;

@Controller
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("/userLoginJump")
    public String userLoginJump() {
        return "userLogin";
    }

    //    用户登入
    @RequestMapping("/userLogin")

    public String userLogin(Model model, User user) {
        int count = userLoginService.userLogin(user);
        if (count > 0) {
            model.addAttribute("message", "欢迎您"+user.getUsername());

        } else {
            model.addAttribute("message", "密码错误");
        }
        return "userHome";
    }
}
