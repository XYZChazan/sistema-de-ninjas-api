package com.chazan.sistema_de_ninjas_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/hello")
    public  String boasVindas(){
        return "hello world";
    }

}
