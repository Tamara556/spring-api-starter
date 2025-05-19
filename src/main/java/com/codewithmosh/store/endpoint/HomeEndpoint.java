package com.codewithmosh.store.endpoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeEndpoint {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name", "Mosh");
        return "index";
    }
}
