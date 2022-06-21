package com.extraordinario.pregunta2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
//@RequestMapping("/extraordinario/saludos")
public class EndPoint {

    @GetMapping("/Hola")
    public String saludoGet(@RequestParam String nombre) {
        return "Hola" + " " + nombre;
    }

    @GetMapping("/HolaM")
    public String holaM() {

        String h = "Hola mundo";
        
        return h;
    }

    @PostMapping("/Persona")
    public String saludoPost(@RequestBody Persona cont){
        return "Adios mundo cruel" + " "+ cont.getCont();
    } 
}