package naire.controller;

import naire.pojo.Qnonlinegaming;
import naire.service.NaireService;
import naire.service.UserNaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserNaireController {

    @Autowired
    private UserNaireService userNaireService;
    @Autowired
    private NaireService naireService;

    //删除问卷
    @RequestMapping("/qnDelect")
    public String qnDelect(int naireid,int userid) {
        userNaireService.qnDelect(naireid,userid);
        return "delectResult";
    }

    //分享问卷
    @RequestMapping("/qnShare")
    public String qnShare(String naireadderss, String nairename, Model model) {
        String link = naireadderss;
        model.addAttribute("link", link);
        model.addAttribute("nairename", nairename);
        return "qnShare";
    }

    //生成问卷报告
    @RequestMapping("/qnReport")
    public String qnReport(String nairename) {
    //使用反射根据传入的问卷名调用方法
        List<Qnonlinegaming> qnonlinegamingList = naireService.qnOnlineGamingReport();
        return "#";
    }
    //添加问卷
    @RequestMapping("/qnAdd")
    public String qnAdd(int naireid,int userid) {
        userNaireService.qnAdd(naireid,userid);
        return "qnAddSuccess";
    }

}
