package com.makeienko.springproject.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MyController {

    @GetMapping("/index")
    public String getIndexJSP() {
        return "index";
    }

    @RequestMapping("/askDetails")
    public String askAboutClientsName() {
        return "ask-name";
    }

//    @RequestMapping("/showDetails")
//    public String showSelectedClient() {
//        return "show-clients-name";
//    }

    @RequestMapping("/showDetails")
    public String showSelectedClient(@RequestParam("clientName") String clientName, Model model) {
        clientName = "Mr." + clientName;
        model.addAttribute("nameAttribute", clientName);
        model.addAttribute("car", "and now you can choose your car!");

        return "show-clients-name";
    }
}
