package manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class qnManagerController {
    @RequestMapping("/qnManagerJump")
    public String qnManagerJump() {
        return "qnManager";
    }
}
