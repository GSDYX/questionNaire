package user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class QnController {
    @RequestMapping("/")
    public String login() {
        return "userLogin";
    }


    @RequestMapping("/myQnJump")
    public String myQnJump(HttpServletRequest request) {
        HttpSession session=request.getSession();
        session.setAttribute("username","user");
        return "myQn";
    }
}
