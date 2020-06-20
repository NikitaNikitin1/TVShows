package com.simbirsoft.tvshows.controller;

import com.simbirsoft.tvshows.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String mainPage(Model model){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = new User();
        user.setUsername(auth.getName());
        model.addAttribute("userForm",new User());
        return "index";
    }

    @GetMapping("/myShows")
    public String my(Model model){
        model.addAttribute("userForm",new User());
        return "myShows";
    }
}
