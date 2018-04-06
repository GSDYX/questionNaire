package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import user.pojo.User;
import user.service.UserSignupService;

@Controller
public class UserSignupController {
    @Autowired
    private UserSignupService userSignupService;

    @RequestMapping("/userSignupJump")
    public String userSignupJump() {
        return "userSignup";
    }

    @RequestMapping("/userSignup")
    public String userSign(Model model, User user) {

        int count = userSignupService.usernameExist(user);
        if (count > 0) {
            model.addAttribute("message", "对不起用户名已存在");

        } else {
            userSignupService.userSignup(user);
            model.addAttribute("message", "注册成功");

        }
        return "message";
    }

}
