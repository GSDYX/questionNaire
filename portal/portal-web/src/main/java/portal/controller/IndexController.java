package portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String indexJump(@RequestParam(required=false) String username, Model model) {
        model.addAttribute("username", "username");
        return "index";
    }
}
