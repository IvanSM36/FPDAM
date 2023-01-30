package com.example.spinnerdb.entidades;

public class Usuario {

    // Atributos
    private Integer id;
    private String nombre;
    private String pass;
    private String telefono;

    // Constructores
    public Usuario() {

    }

    public Usuario(Integer id, String nombre, String pass, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.pass = pass;
        this.telefono = telefono;
    }

    // Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

