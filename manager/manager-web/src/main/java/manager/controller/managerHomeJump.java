package manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//public class managerHomeJump {
//    @RequestMapping("/")
//    public String managerHomeJump() {
//        return "index";
//    }
//}
@Controller
public class ManagerHomeJump {
    @RequestMapping("/managerHomeJump")
    public String managerHomeJump() {
        return "managerHome";
    }
}
