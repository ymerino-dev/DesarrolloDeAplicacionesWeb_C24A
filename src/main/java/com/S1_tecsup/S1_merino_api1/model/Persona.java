package com.S1_tecsup.S1_merino_api1.model;

public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    // constructor para inicializar los datos
    public Persona(String nombre, String apellido, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Getters para que la página web pueda leer esta información
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}