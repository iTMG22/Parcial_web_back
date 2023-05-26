package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/libro")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/listar")
    public List<libro>listar(){
        return libroService.Listar();
    }

    @PostMapping ("/agregar")
    public libro agregar(@RequestBody libro p){
        return libroService.add(p);
    }
}
