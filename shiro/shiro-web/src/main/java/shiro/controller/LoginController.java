package shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import shiro.pojo.UserCustom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/loginJump")
//    @RequestMapping("/")
    public String loginJump() {
        return "login";
    }

    @RequestMapping("/unauthorizedJump")
    public String unauthorizeJump() {
        return "unauthorized";
    }

    @RequestMapping("/login")
    public String login(Model model, HttpServletRequest request) throws Exception {


        //如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        //根据shiro返回的异常类路径判断，抛出指定异常信息
        if (exceptionClassName != null) {
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                model.addAttribute("exception", "账号不存在");
            } else if (IncorrectCredentialsException.class.getName().equals(
                    exceptionClassName)) {
                model.addAttribute("exception", "用户名/密码错误");
            } else if ("randomCodeError".equals(exceptionClassName)) {
                model.addAttribute("exception", "验证码错误");
            } else {
                model.addAttribute("exception", "未知错误");
            }

        }

        //此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
        //登陆失败还到login页面
        return "login";
    }

    @RequestMapping("/roleJump")
    public String userOrManagerJump(HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        UserCustom userCustom= (UserCustom) subject.getPrincipal();
        String username = userCustom.getUsername();
        HttpSession session = request.getSession();
        session.setAttribute("username",username);
        if (subject.hasRole("user")) {
            return "index";
        } else {
            return "managerHomeJump";
        }

    }


}
