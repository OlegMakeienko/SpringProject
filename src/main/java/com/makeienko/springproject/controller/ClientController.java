package com.makeienko.springproject.controller;

import com.makeienko.springproject.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {

    @GetMapping("/index")
    public String getIndexJSP() {
        return "index";
    }

    @RequestMapping("/askDetails")
    public String askAboutClientsName(Model model) {

        model.addAttribute("client", new Client());
        return "ask-details";
    }

//    @RequestMapping("/showDetails")
//    public String showSelectedClient() {
//        return "show-clients-name";
//    }

    @RequestMapping("/showDetails")
    public String showSelectedClient(@ModelAttribute("client") Client client) {

        return "show-clients-details";
    }
}
