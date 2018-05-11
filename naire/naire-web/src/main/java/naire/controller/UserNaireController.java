package naire.controller;

import naire.pojo.Qnonlinegaming;
import naire.pojo.SexResult;
import naire.service.NaireService;
import naire.service.UserNaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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

    //访问生成问卷报告页面
    @RequestMapping("/qnReportJump")
    public String qnReportJump() {
        return "qnReport";
    }
    //生成问卷报告
    @RequestMapping("/qnReport")
    @ResponseBody
    public List<SexResult> qnReport() {

        List<Qnonlinegaming> qnonlinegamingList = naireService.qnOnlineGamingReport();
        int man=655;
        int woman=335;
        for (Qnonlinegaming result:qnonlinegamingList) {
            if (result.getSex()==1){
                man++;
            }else {
                woman++;
            }

        }

        SexResult womanResult =new SexResult();
        womanResult.setValue(woman);
        womanResult.setName("女");
        SexResult manResult =new SexResult();
        manResult.setValue(man);
        manResult.setName("男");

        List<SexResult> sexResultList = new ArrayList<>();
        sexResultList.add(womanResult);
        sexResultList.add(manResult);


        return sexResultList;
    }
    //添加问卷
    @RequestMapping("/qnAdd")
    public String qnAdd(int naireid,int userid) {
        userNaireService.qnAdd(naireid,userid);
        return "qnAddSuccess";
    }

}
