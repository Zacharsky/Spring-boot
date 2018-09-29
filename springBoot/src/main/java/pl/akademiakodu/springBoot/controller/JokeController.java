package pl.akademiakodu.springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.akademiakodu.springBoot.service.JokerService;


@Controller
public class JokeController {

    @Autowired
    private JokerService jokerService;

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokerService.getJoke());

        return "home";

    }

}

