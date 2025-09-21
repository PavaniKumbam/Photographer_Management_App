package com.example.photographersmanagement.controller;

import com.example.photographersmanagement.model.Photographer;
import com.example.photographersmanagement.service.PhotographerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    private PhotographerService service;

    // Loads home page with a welcome message
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Photographer Management!");
        return "home";  // → looks for home.html inside /resources/templates
    }

    // Loads a page with all photographers
    @GetMapping("/photographers")
    public String listPhotographers(Model model) {
        List<Photographer> photographers = service.getAllPhotographers();
        model.addAttribute("photographers", photographers);
        return "photographers";  // → looks for photographers.html in /resources/templates
    }
}
