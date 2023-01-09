/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema10Ficheros.Relacion1Solu;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Carlos
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        try(DataInputStream br = new DataInputStream(new FileInputStream("agenda.dat"));     
          ){
            while(true){
                String st = br.readUTF();
                int telefono = br.readInt();
                agenda.añadirContacto(st, telefono);
            }
        }catch(EOFException ex){ 
            
        }catch(FileNotFoundException ex){ 
            System.out.println(ex.getMessage());
        }catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        try(BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
                    ){
        String resp;
            do{
            System.out.println("--- Opciones disponibles ---");
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
                    agenda.añadirContacto(nombre, telf);
                    agenda.añadirAux(nombre, telf);
                    break;
                case "2":
                    System.out.println("Introduzca nombre del contacto que desea eliminar");
                    nombre = consola.readLine();
                    agenda.eliminarContacto(nombre);
                    break;
                case "3": 
                    agenda.imprimirContactos();
                    break;
            }
            }while(resp.equals("4") == false);
        }catch(EOFException ex){ 
            System.out.println(ex.getMessage());
        }catch(FileNotFoundException ex){ 
            System.out.println(ex.getMessage());
        }catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
