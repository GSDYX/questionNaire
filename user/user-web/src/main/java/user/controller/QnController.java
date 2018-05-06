package user.controller;

import naire.pojo.Naire;
import naire.service.UserNaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import user.pojo.User;
import user.pojo.UserCustom;
import user.service.UserService;

import java.util.List;

@Controller
public class QnController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserNaireService userNaireService;
//    @RequestMapping("/")
//    public String login() {
//        return "userLogin";
//    }


    //    @RequestMapping("/myQnJump")
    @RequestMapping("/")
    public String myQnJump(Model model) {

        String username = "user";
        //根据用户名获取用户信息
        User user = userService.findUserWhitUsername(username);
        //根据用户id获取拥有的调查问卷
        List<Naire> naireLists = userNaireService.findNaireListByUserId(user.getUserid());
        UserCustom userCustom = new UserCustom();
        userCustom.setNaires(naireLists);
        userCustom.setUser(user);
        model.addAttribute("userCustom", userCustom);
        return "myQn";
    }

    @RequestMapping("/qnAddJump")
    public String qnAddJump(Model model) {
        String username = "user";
        //根据用户名获取用户信息
        User user = userService.findUserWhitUsername(username);

        List<Naire> naireListAll = userNaireService.findNaireListAll();
        model.addAttribute("naireListAll", naireListAll);
        model.addAttribute("userid", user.getUserid());
        return "qnAdd";
    }
}
