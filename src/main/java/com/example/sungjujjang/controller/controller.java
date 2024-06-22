package com.example.sungjujjang.controller;

import org.springframework.stereotype.Controller;
import java.io.IOException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Random;

@Controller
public class controller {

    @GetMapping("/")
    public String index(Model model) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int num = random.nextInt(18)+1;
        model.addAttribute("image", num);
        return "index";
    }

    @GetMapping("/image")
    public String image(Model model) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int num = random.nextInt(18)+1;
        model.addAttribute("image", num);
        return "image";
    }
}
