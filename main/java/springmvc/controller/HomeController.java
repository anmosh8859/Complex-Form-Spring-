package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class HomeController {
    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String home(Model model){
        System.out.println("this is home url");


        model.addAttribute("name", "Anand Mohan Sharma");
        model.addAttribute("id",123);


        List<String> li = new ArrayList<String>();
        li.add("Anand");
        li.add("Swagatika");
        li.add("Piyush");
        li.add("Abhinav");

        model.addAttribute("list",li);


        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("this is about url");
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        ModelAndView mav = new ModelAndView();
        System.out.println("This is help controller...");
        mav.addObject("name","Anand Mohan Sharma");
        mav.addObject("id",12345);
        LocalDateTime n = LocalDateTime.now();
        mav.addObject("time",n);

        List<Integer> al = new ArrayList<>();
        al.add(1234);
        al.add(456);
        al.add(789);

        mav.addObject("marks",al);

        mav.setViewName("help");
        return mav;

    }
}
