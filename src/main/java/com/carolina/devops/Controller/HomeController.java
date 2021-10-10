package com.carolina.devops.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value= "/")
    public String getMethodName() {
        return "Olá Viceri!";
    }
}
