package naire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QnController {
    @RequestMapping("/")
    public String qnJump() {
        return "onlineGaming";
    }
}
