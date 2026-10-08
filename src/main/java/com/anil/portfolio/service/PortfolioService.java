package com.anil.portfolio.service;

import com.anil.portfolio.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * All portfolio content lives here. Edit this one file to update the website.
 */
@Service
public class PortfolioService {

    public Profile getProfile() {
        return new Profile(
                "Anil Kushwah",
                "Full Stack Developer",
                "I build fast, scalable, production-ready web apps with React, Next.js, Node.js, "
                        + "Java Spring Boot and MongoDB/MySQL - from UI to APIs to deployment.",
                "Full Stack Developer at Divyan Technologies Pvt. Ltd. (since March 2026), shipping client "
                        + "websites and web apps with the MERN stack, Next.js and Java Spring Boot. I design REST APIs, "
                        + "manage the complete development lifecycle, and also understand real e-commerce operations "
                        + "(Amazon, Flipkart, Meesho, Shopify, WordPress). B.Tech in Information Technology (2022-2026), "
                        + "Chameli Devi Group of Institutions, Indore, with training in Java and its frameworks, DSA, "
                        + "databases, C and C++.",
                "anilkushwah1465@gmail.com",
                "+917999963137",
                "+91 79999 63137",
                "Dewas, India",
                List.of("Full Stack Developer", "React & Next.js Developer",
                        "Java Spring Boot Developer", "Node.js Backend Engineer", "Problem Solver")
        );
    }

    public List<SocialLink> getSocialLinks() {
        return List.of(
                new SocialLink("GitHub", "gh", "https://github.com/anil-kushwah88"),
                new SocialLink("LinkedIn", "li", "https://www.linkedin.com/in/anil-kushwah-a564a4253"),
                new SocialLink("LeetCode", "lc", "https://leetcode.com/u/anilkushwah1465/"),
                new SocialLink("Email", "ml", "mailto:anilkushwah1465@gmail.com"),
                new SocialLink("Phone", "ph", "tel:+917999963137")
        );
    }

    public List<Stat> getStats() {
        return List.of(
                new Stat("MERN", "Primary stack"),
                new Stat("Next.js", "Production sites"),
                new Stat("Java", "Spring Boot"),
                new Stat("AWS", "Certified Foundations"),
                new Stat("DSA", "LeetCode practice")
        );
    }

    public List<SkillGroup> getSkillGroups() {
        return List.of(
                new SkillGroup("Frontend", List.of("React.js", "Next.js", "JavaScript", "HTML5", "CSS3", "Tailwind", "Bootstrap")),
                new SkillGroup("Backend", List.of("Node.js", "Express.js", "REST APIs", "JWT Auth")),
                new SkillGroup("Java & Frameworks", List.of("Core Java", "OOP", "Collections", "Spring Boot",
                        "Spring MVC", "Spring Data JPA", "Hibernate", "JDBC", "Maven")),
                new SkillGroup("Database", List.of("MongoDB", "MySQL")),
                new SkillGroup("Languages & CS", List.of("C", "C++", "Data Structures")),
                new SkillGroup("Tools & Cloud", List.of("Git", "GitHub", "Postman", "VS Code", "Vercel", "AWS Basics")),
                new SkillGroup("Business", List.of("Shopify", "WordPress", "SEO Basics", "Amazon / Flipkart / Meesho"))
        );
    }

    /** Names shown in the scrolling marquee. */
    public List<String> getMarquee() {
        List<String> list = new ArrayList<>(List.of("React.js", "Next.js", "Node.js", "Express", "MongoDB",
                "MySQL", "JavaScript", "Java", "Spring Boot", "Hibernate", "C++", "Tailwind", "Git", "AWS"));
        return list;
    }

    public List<Experience> getExperience() {
        return List.of(new Experience(
                "March 2026 - Present",
                "Full Stack Developer",
                "Divyan Technologies Pvt. Ltd.",
                List.of(
                        "Built responsive, production-ready business websites with React, Next.js, Node.js, Express, MongoDB and MySQL.",
                        "Designed REST APIs connecting frontend, backend and databases.",
                        "Owned the lifecycle: components, state management, backend logic, testing and deployment.",
                        "Worked with Git/GitHub and managed Amazon, Flipkart, Meesho, WordPress and Shopify work.")
        ));
    }

    // TODO: add Trustlon / other Vercel live URLs below
    public List<Project> getProjects() {
        return List.of(
                new Project("Divyan Technologies Website",
                        "Live company website built for Divyan Tech - responsive, SEO-friendly and production deployed.",
                        List.of("Next.js", "React", "Node.js"), "https://divyantech.com", ""),
                new Project("Trustlon",
                        "Live client business website delivered end-to-end with modern UI and performance focus.",
                        List.of("React", "Next.js", "Vercel"), "", ""),
                new Project("KG E-Commerce",
                        "Full-stack e-commerce application with product catalog, cart and order flow.",
                        List.of("MERN", "REST API", "MongoDB"), "", "https://github.com/anil-kushwah88/kg_ecommerce"),
                new Project("Food Delivery App (MERN)",
                        "Customer app plus admin dashboard, JWT auth, Stripe payments, Multer uploads and cart-to-checkout flow.",
                        List.of("React", "Express", "MongoDB", "Stripe"), "", "https://github.com/anil-kushwah88")
        );
    }

    public List<Certificate> getCertificates() {
        return List.of(
                new Certificate("AWS Academy Cloud Foundations", "20 hours - Issued 12/08/2024",
                        "https://www.credly.com/go/IbfnkwAi"),
                new Certificate("Full Stack Web Development", "HTML, CSS, Bootstrap, JavaScript, React.js, Git & GitHub", ""),
                new Certificate("Core Programming", "Java & Spring frameworks, databases, data structures, C and C++ training with certificates.", ""),
                new Certificate("B.Tech - Information Technology", "Chameli Devi Group of Institutions, Indore - 2022-2026", "")
        );
    }
}
