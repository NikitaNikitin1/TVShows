package com.simbirsoft.tvshows.controller;

import com.simbirsoft.tvshows.model.User;
import com.simbirsoft.tvshows.service.GenreService;
import com.simbirsoft.tvshows.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private ShowService showsService;

    @Autowired
    private GenreService genreService;

    @GetMapping
    public String mainPage(Model model){
        model.addAttribute("userForm",new User());
        model.addAttribute("shows",showsService.findAll());
        model.addAttribute("genres",genreService.findAll());
        return "index";
    }

}
