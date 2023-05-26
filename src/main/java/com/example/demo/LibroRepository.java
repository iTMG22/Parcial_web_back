package com.example.demo;
import org.springframework.data.repository.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository <libro, String>{
}
