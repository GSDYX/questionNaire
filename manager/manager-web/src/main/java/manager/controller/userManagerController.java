package manager.controller;

import com.github.pagehelper.PageInfo;
import manager.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserManagerController {

    @Autowired
    private UserManagerService userManagerService;
    @RequestMapping("/userManager")
    public String userManagerJump(Model model, @RequestParam(required=true, defaultValue="1") int pageNumber, @RequestParam(required=true, defaultValue="10") int pageSize) {
        PageInfo pageInfo = userManagerService.getUserList(pageNumber,pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "userManager";
    }


    //删除用户
    @RequestMapping("/userDelect")
    public String userDelect(int userid) {
        userManagerService.userDelect(userid);
        return "userDelectSuccess";
    }


}
