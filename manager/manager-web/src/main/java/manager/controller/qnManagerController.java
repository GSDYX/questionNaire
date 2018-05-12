package manager.controller;

import naire.pojo.Naire;
import naire.service.ManagerNaireService;
import naire.service.UserNaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class QnManagerController {
    @Autowired
    private UserNaireService userNaireService;
    @Autowired
    private ManagerNaireService managerNaireService;



    @RequestMapping("/qnManagerJump")
    public String qnAddJump(Model model) {

        List<Naire> naireListAll = userNaireService.findNaireListAll();
        model.addAttribute("naireListAll", naireListAll);
        return "qnManager";
    }

    //    全域删除问卷调查
    @RequestMapping("/qnManagerDelect")
    public String qnManagerDelect(int naireid) {
        managerNaireService.qnManagerDelect(naireid);
        return "qnDelectSuccess";
    }
}
