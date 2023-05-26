package com.example.demo;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController

@RequestMapping("/libro")
public class LibroController {
    @Autowired
    LibroService service;

    @GetMapping("/listar")
    public List<libro>listar(){
        return service.Listar();
    }

    @PostMapping ("/agregar")
    public libro agregar(@RequestBody libro p){
        return service.add(p);
    }
}
