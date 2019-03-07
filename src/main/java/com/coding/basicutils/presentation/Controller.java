package com.coding.basicutils.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping({"/","/ping"})
    public String ping(){
        LOG.info("Successful get call made to Basic App Controller : {}", "App is up and running");
        return "pong";
    }
}
