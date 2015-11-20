package com.gman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gmanpark on 2015-11-18.
 */
@Controller
@RequestMapping("/service")
public class ServiceController {
    @RequestMapping("/index")
    public String index(Model model) {


        return "/index";
    }
}
