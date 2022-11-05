package kz.narxoz.springbootapp.controllers;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/index")
    public String home(Model model){
        model.addAttribute("name", "Tom");
        return "index";
    }

}
