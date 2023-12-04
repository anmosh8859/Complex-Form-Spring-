package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springmvc.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContactController {
    @Autowired
    private UserService userService;

    @ModelAttribute
    public void commonData(Model m){
        m.addAttribute("Header","Enter the details");
    }
    @RequestMapping("/form")
    public String show(Model m){
        return "form";
    }

//    @RequestMapping(path = "/processForm", method = RequestMethod.POST)
//    public String processForm(@RequestParam("email") String email,
//                              @RequestParam("password") String password,
//                              springmvc.Model model){
//
//        User u = new User();
//        u.setEmail(email);
//        u.setPassword(password);
//
//        System.out.println(u);
//
//        model.addAttribute("user",u);
//
//        return "processForm";
//    }
    @RequestMapping(path = "/processForm", method = RequestMethod.POST)
    public String processForm(@ModelAttribute User user, Model model){
        this.userService.createUser(user);
        System.out.println(user);
        return "processForm";
    }
}