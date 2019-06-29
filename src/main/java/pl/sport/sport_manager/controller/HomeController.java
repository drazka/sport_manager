package pl.sport.sport_manager.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePageShow() { return "index"; }

    @GetMapping("/login")
    public String loginPageShow() { return "login"; }

    @GetMapping("/register")
    public String registerPageShow() { return "register"; }

}
