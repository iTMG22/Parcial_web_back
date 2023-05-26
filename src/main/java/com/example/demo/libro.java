package com.example.demo;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Libro_TomasMartinez")
public class libro {

    @Column (name="titulo")
    private String titulo;
    @Id 
    private String referencia;
    @Column (name="Autor")
    private String Autor;
    @Column (name="Precio")
    private int Precio;
    @Column (name="Ubicacion")
    private String Ubicacion;
    
    public libro() {

    }

    public libro(String titulo, String referencia, String Autor, int Precio, String Ubicacion) {
        this.titulo = titulo;
        this.referencia = referencia;
        this.Autor = Autor;
        this.Precio = Precio;
        this.Ubicacion = Ubicacion;
    }
}
