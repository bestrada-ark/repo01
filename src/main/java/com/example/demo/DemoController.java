package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping(value = "/api/saludo", method = RequestMethod.GET)
    public String saludo(@RequestParam(defaultValue = "humano") String nombre){
        return "Hola " + nombre + " !!";
    }
}