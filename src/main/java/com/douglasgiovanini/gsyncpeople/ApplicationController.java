package com.douglasgiovanini.gsyncpeople;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class ApplicationController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello!";
    }
}
