package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(path = "/")
    public String index(Model model) {
        //model.addAttribute("nombre", "Juan Perez"); // Ejemplo de dato
        return "Hello World!!!! This is a test, I think that it's working"; // Nombre de la plantilla en templates
    }
}