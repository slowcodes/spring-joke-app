package ng.com.bitsystems.springjokeapp.controllers;

import ng.com.bitsystems.springjokeapp.services.JokeReactor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeReactor jokeReactor;
    @Autowired
    public JokeController(JokeReactor jokeReactor){
        this.jokeReactor=jokeReactor;
    }

    @RequestMapping({"/",""})
    public String displayJoke(Model model){
        model.addAttribute("joke", jokeReactor.returnJoke());
        return "chucknorris";
    }
}
