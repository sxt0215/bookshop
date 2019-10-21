package com.canway.book_store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BootStoreController {

    @RequestMapping("/")
    public String home(){
        return "/index.html";
    }

    @RequestMapping("/manage")
    public String manage(){
        return "/manage.html";
    }

}
