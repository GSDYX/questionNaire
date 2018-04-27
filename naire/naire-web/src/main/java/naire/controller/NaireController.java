package naire.controller;

import naire.pojo.Qnonlinegaming;
import naire.service.NaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaireController {
    @Autowired
    private NaireService naireService;
    @RequestMapping("/")
    public String qnJump() {
        return "onlineGaming";
    }

    @RequestMapping("/naireForm")
    public String naireForm(Qnonlinegaming qnonlinegaming) {
        naireService.QnonlinegamingUp(qnonlinegaming);
        return "success";
    }
}
