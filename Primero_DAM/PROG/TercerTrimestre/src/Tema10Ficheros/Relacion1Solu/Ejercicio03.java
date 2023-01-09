package Tema10Ficheros.Relacion1Solu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ang
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fichero = "fichero.txt";
        int auxiliar = 0;
        try{
        	BufferedReader br = new BufferedReader(new FileReader(fichero));    
                  
            while(br.ready() == true){//Indica si esta transmisión está lista para ser leída. Un flujo de caracteres almacenado en búfer está listo si el búfer no está vacío o si el flujo de caracteres subyacente está listo.
                int resultado = Integer.parseInt(br.readLine());
                System.out.println(resultado);
                auxiliar += resultado;
            }
            System.out.println("Resultado total " + auxiliar);
            br.close();
            
        }catch(FileNotFoundException ex){ 
            System.out.println(ex.getMessage());
        }catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
