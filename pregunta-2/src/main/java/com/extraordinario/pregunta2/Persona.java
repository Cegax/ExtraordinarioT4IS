package com.extraordinario.pregunta2;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Persona implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private String cont;

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
