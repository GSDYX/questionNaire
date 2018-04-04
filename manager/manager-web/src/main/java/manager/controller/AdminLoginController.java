package manager.controller;

import manager.pojo.Admin;
import manager.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminLoginController {

    @Autowired
    private AdminLoginService adminLoginService;


        @RequestMapping("/login")
    public String login(Model model, String adminname) throws Exception {


        Admin admin = adminLoginService.findByName(adminname);

        model.addAttribute("admin",admin);

        return "result";

    }

}