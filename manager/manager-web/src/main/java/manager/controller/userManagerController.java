package manager.controller;

import com.github.pagehelper.PageInfo;
import manager.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class userManagerController {

    @Autowired
    private UserManagerService userManagerService;

    @RequestMapping("/userManager")
    public String userManagerJump(Model model,@RequestParam(required=true, defaultValue="1") int pageNumber, @RequestParam(required=true, defaultValue="10") int pageSize) {
        PageInfo pageInfo = userManagerService.getUserList(pageNumber,pageSize);
        model.addAttribute("pageInfo", pageInfo);
        return "userManager";
    }

//    @ResponseBody
//    @RequestMapping("/userItems")
//    public PageInfo getUserList(@RequestParam(required=true, defaultValue="1") int pageNum, @RequestParam(required=true, defaultValue="10") int pageSize) {
//        PageInfo pageInfo = userManagerService.getUserList(pageNum,pageSize);
//        return pageInfo;
//    }



}
