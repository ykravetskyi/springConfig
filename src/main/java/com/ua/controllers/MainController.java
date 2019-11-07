package com.ua.controllers;

import com.ua.dao.HumanDAO;
import com.ua.entity.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    HumanDAO humanDAO;

    @GetMapping("/")
    public String main(Model model){
        List<Human> humans = humanDAO.findAll();
        model.addAttribute("humans", humans);
        return "main";
    }


}
