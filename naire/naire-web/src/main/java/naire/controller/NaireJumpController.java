package naire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NaireJumpController {
    @RequestMapping("/qnOnlineGamingJump")
    public String QnOnlineGamingJump() {
// 用户显示的问卷调查表，根据session判断是否显示提交按钮
        return "onlineGaming";
    }
}
