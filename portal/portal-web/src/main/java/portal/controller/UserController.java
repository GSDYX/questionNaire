package portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
    //    页面跳转
    @RequestMapping("/userLoginJump")
    public String userLoginJump() {
        return "userLogin";
    }
//
////    用户登入
//    @RequestMapping("/userLogin")
//    public  String userLogin(Model model,User user){
//    }
}
