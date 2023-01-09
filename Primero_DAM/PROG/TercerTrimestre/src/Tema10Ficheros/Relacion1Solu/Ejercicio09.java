package Tema10Ficheros.Relacion1Solu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ang
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String fichero = args[0];
       String palabra = args[1];
       String auxiliar;
       int contPalabra = 0;
       int contLinea = 0;
       
       ArrayList<Integer> lista = new ArrayList<>();
       
       try{
    	   
    	   BufferedReader br = new BufferedReader(new FileReader(fichero));   
       
           
           while(br.ready()){
                contLinea++;
                auxiliar = br.readLine();
                if(auxiliar.equals(palabra)){
                   contPalabra++; 
                   lista.add(contLinea);
                } 
           }
           System.out.println("Palabra " + palabra + " encontrada " + contPalabra + " veces en:");
           for(int i : lista){
               lista.indexOf(i);
               System.out.println("Linea " + i);
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

