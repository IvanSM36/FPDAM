/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema10Ficheros.Relacion1Solu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Carlos
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("agenda.txt"));
            BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));    
          ){
            Agenda uno = new Agenda();
            while(br.ready()){
                String[] copia = br.readLine().split(", ");
                uno.añadirContacto(copia[0], Integer.parseInt(copia[1]));
            }
            String resp;
            do{
            System.out.println("---       MENU        ---");
            System.out.println("---   1.Añadir contacto  ---");
            System.out.println("---  2.Eliminar contacto ---");
            System.out.println("--- 3.Mostrar todos los contactos ---");
            System.out.println("---       4.Salir       ---");
            System.out.print("Opcion elegida: ");
            
            resp = consola.readLine();
            String nombre;
            String telefono;
            
            switch(resp){
                case "1": 
                    System.out.println("Introduzca nombre del nuevo contacto");
                    nombre = consola.readLine();
                    System.out.println("Introduzca telefono del nuevo contacto");
                    telefono = consola.readLine();
                    int telf = Integer.parseInt(telefono);
                    uno.añadirContacto(nombre, telf);
                    uno.añadirAux(nombre, telf);
                    break;
                case "2":
                    System.out.println("Introduzca nombre del contacto que desea eliminar");
                    nombre = consola.readLine();
                    uno.eliminarContacto(nombre);
                    break;
                case "3": 
                    uno.imprimirContactos();
                    break;
            }
            }while(resp.equals("4") == false);
            
            
            
        }catch(FileNotFoundException ex){ 
            System.out.println(ex.getMessage());
        }catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }     
    }
    
}
