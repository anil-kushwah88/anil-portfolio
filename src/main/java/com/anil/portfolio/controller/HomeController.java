package com.anil.portfolio.controller;

import com.anil.portfolio.service.PortfolioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final PortfolioService service;

    public HomeController(PortfolioService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("profile", service.getProfile());
        model.addAttribute("socials", service.getSocialLinks());
        model.addAttribute("stats", service.getStats());
        model.addAttribute("skillGroups", service.getSkillGroups());
        model.addAttribute("marquee", service.getMarquee());
        model.addAttribute("experience", service.getExperience());
        model.addAttribute("projects", service.getProjects());
        model.addAttribute("certificates", service.getCertificates());
        return "index";
    }
}
