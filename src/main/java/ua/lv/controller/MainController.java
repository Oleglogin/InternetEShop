package ua.lv.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by User on 31.07.2019.
 */
@Controller
public class MainController {

    @GetMapping(value = "/")
    public String toMainPage(){
        return "welcome";
    }
}
