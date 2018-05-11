package naire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestJump {
    @RequestMapping("/test")
    public String testJump() {
        return "test";
    }
}
