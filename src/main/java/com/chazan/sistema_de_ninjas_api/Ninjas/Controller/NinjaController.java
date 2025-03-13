package com.chazan.sistema_de_ninjas_api.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/hello")
    public  String boasVindas(){
        return "hello world";
    }

}
