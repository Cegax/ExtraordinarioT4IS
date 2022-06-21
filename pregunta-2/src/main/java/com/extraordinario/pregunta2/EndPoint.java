package com.extraordinario.pregunta2;

import javax.print.DocFlavor.STRING;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value="/saludar2/{nombre}", method = RequestMethod.GET)
    public String saludarPath2(@PathVariable String nombre){
        return "Hola nombre" + nombre;
    }
        
    
}