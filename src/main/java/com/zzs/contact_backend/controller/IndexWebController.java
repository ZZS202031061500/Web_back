package com.zzs.contact_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class IndexWebController {
    @GetMapping
    public String getIndex() {
        return "index.html";
    }
}
