package Tema10Ficheros.Relacion1Solu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Contacto {
    private String nombre;
    private int telefono;
    
    public Contacto(){
        this.nombre = "";
        this.telefono = 0;
    }
    public Contacto(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString(){
    String s = "";
    s += "Nombre: " + this.nombre + "\n";
    s += "Telefono: " + this.telefono + "\n";
    return s;
    }
    
}
