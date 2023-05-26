package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class LibroService { 
    @Autowired
    LibroRepository repository;
        public List<libro>Listar(){
            return repository.findAll();
        }
        public libro add(libro p){
            return repository.save(p);}
}
