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

    @RequestMapping("/QnonlinegamingUp")
    public String qnOnlineGamingUp(Qnonlinegaming qnonlinegaming) {
        naireService.qnOnlineGamingUp(qnonlinegaming);
        return "success";
    }



}
