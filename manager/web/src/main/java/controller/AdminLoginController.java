package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Admin;
import service.AdminLoginService;

import java.util.List;

@Controller
public class AdminLoginController {

    @Autowired
    private AdminLoginService adminLoginService;


    //    @RequestMapping("/login")
//    public String login(Model model, String adminname) throws Exception {
//
//
//        Admin admin = adminLoginService.findByName(adminname);
//
//        model.addAttribute("admin",admin);
//
//        return "result";
//
//    }
    @RequestMapping("/login")
    public String findByAdminID(Model model, int adminID) throws Exception {
        Admin admin = adminLoginService.findByAdminID(adminID);
        model.addAttribute("admin", admin);
        return "result";
    }

}