package com.lancelot.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    // Go access to localhost
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    // Go access to localhost/hello
    @RequestMapping("/hello")
    public String sayHello() {
        return "index.html";
    }
}