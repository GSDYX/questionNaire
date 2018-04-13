package manager.controller;

import common.pojo.PageHelperResult;
import manager.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class userManagerController {

    @Autowired
    private UserManagerService userManagerService;

    @RequestMapping("/userManagerJump")
    public String userManagerJump() {
        return "userManager";
    }


    @RequestMapping("/userItems")
    @ResponseBody
    public PageHelperResult getUserList() {
        PageHelperResult result = userManagerService.getUserList();
         return result;
    }
}
