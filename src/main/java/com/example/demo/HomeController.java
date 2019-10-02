package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/form")
    public String loadForm(){
        return "formpage";
    }
    @RequestMapping("/outPut")
    public String outPutPage(@RequestParam("myVal") String email, Model model){
        model.addAttribute("email", email);
        return "template";

    }

}
