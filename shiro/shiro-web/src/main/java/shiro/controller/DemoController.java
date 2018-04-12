package shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {
    @RequestMapping("/roleJump")
    public String roleJump() {
        return "role";
    }
}
