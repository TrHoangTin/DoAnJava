package com.example.WebBanHang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {
    @GetMapping("/403")
    public String accessDenied() {
        return "error/403";
    }
    @GetMapping("/404")
    public String notFound(){
        return "error/404";
    }
}
