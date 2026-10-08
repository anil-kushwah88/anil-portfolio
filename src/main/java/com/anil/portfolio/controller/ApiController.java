package com.anil.portfolio.controller;

import com.anil.portfolio.model.Project;
import com.anil.portfolio.model.Profile;
import com.anil.portfolio.service.PortfolioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/** Simple JSON endpoints: /api/profile and /api/projects */
@RestController
@RequestMapping("/api")
public class ApiController {

    private final PortfolioService service;

    public ApiController(PortfolioService service) {
        this.service = service;
    }

    @GetMapping("/profile")
    public Profile profile() {
        return service.getProfile();
    }

    @GetMapping("/projects")
    public List<Project> projects() {
        return service.getProjects();
    }
}
