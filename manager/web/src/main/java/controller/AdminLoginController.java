package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.AdminLoginService;

@Controller
public class AdminLoginController {

    @Autowired
    private AdminLoginService adminLoginService;


    @RequestMapping("/login")
    public ModelAndView login() throws Exception {
        //调用servie来查询商品列表
        int result=adminLoginService.findByName("name");

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("result",result);
        //指定逻辑视图名itemsList.jsp
        modelAndView.setViewName("result");

        return modelAndView;

    }


}