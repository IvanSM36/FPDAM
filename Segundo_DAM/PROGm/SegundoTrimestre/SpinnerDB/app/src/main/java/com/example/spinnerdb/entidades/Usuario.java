package com.example.spinnerdb.entidades;

public class Usuario {

    // Atributos
    private int id;
    private String nombre;
    private String pass;
    private int telefono;

    // Constructores
    public Usuario(int id, String nombre, String pass, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.pass = pass;
        this.telefono = telefono;
    }

    // Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

