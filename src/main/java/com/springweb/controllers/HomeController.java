package com.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping(path = "/index")
    public String goHome() {
        return "index";
    }

    @RequestMapping(path = "/about")
    public String goAbout() {
        return "about";
    }

    @RequestMapping(path = "/services")
    public String goServices() {
        return "services";
    }

    @RequestMapping(path = "/contact")
    public String goContact() {
        return "contact";
    }

    @GetMapping(path = "/user/{id}")
    public String goUser(@PathVariable String id) {
        return "user";
    }

    @GetMapping(path = "/admin")
    public String goAdmin() {
        return "admin";
    }
}