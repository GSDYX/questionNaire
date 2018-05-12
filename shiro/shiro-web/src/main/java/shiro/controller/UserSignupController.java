package shiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import shiro.pojo.User;
import shiro.service.UserSignupService;

import java.util.List;

@Controller
public class UserSignupController {
    @Autowired
    private UserSignupService userSignupService;

    @RequestMapping("/userSignupJump")
    public String userSignupJump() {
        return "userSignup";
    }

    @RequestMapping("/userSignup")
    public String userSign(Model model, @Validated User user,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            //获取错误
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("errors", errors);

            //如果校验错误，仍然回到商品修改页面
            return "userSignup";
        }



        int count = userSignupService.usernameExist(user);
        if (count > 0) {
            model.addAttribute("message", "对不起用户名已存在");
            return "userSignup";
        } else {
            userSignupService.userSignup(user);
            model.addAttribute("message", "注册成功");
            return "signupSuccessMessage";
        }

    }

}
