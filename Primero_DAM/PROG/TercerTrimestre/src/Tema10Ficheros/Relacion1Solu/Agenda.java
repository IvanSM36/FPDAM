package Tema10Ficheros.Relacion1Solu;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Agenda {
    private ArrayList<Contacto> listaContactos;
    
    public Agenda(){
        this.listaContactos = new ArrayList<>();
    }

    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }
    public void añadirContacto(String nombre, int telefono){
        Contacto e = new Contacto();
        e.setNombre(nombre);
        e.setTelefono(telefono);
        this.listaContactos.add(e);
    }
    public void añadirAux(String nombre, int telefono){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("agenda.txt", true)); 
          ){
            bw.write(nombre + "," + " " + Integer.toString(telefono) + "\n");
        }catch(FileNotFoundException ex){ 
            System.out.println(ex.getMessage());
        }catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }  
    }
    public void eliminarContacto(String nombre){
        for(int i = 0; i<this.listaContactos.size(); i++){
            if(this.listaContactos.get(i).getNombre().equals(nombre)){
                this.listaContactos.remove(i);
                System.out.println("El contacto ha sido eliminado");
            }
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("agenda.txt", false)); 
          ){
            for(int i = 0; i<this.listaContactos.size();i++){
                bw.write(this.listaContactos.get(i).getNombre() + ", " + this.listaContactos.get(i).getTelefono() + "\n");
            }
        }catch(FileNotFoundException ex){ 
            System.out.println(ex.getMessage());
        }catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    public void imprimirContactos(){
        try(BufferedReader br = new BufferedReader(new FileReader("agenda.txt")); 
          ){
            while(br.ready()){
                System.out.println(br.readLine());  
            }
        }catch(FileNotFoundException ex){ 
            System.out.println(ex.getMessage());
        }catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
   
    
}   

