package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
    @RequestMapping("/one")
    public String one(){
        System.out.println("This is one");
        return "redirect: enjoy";
    }
    @RequestMapping("/enjoy")
    public RedirectView two(){
        System.out.println("This is two [enjoy]");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("form");
        return redirectView;
    }
}
