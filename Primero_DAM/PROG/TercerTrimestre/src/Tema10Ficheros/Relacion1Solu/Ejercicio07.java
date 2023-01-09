package Tema10Ficheros.Relacion1Solu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ang
 * 
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String fichero = args[0];
      
        int cont = 0;
        int total = 0;
        try {
        		BufferedReader br = new BufferedReader(new FileReader(fichero));
          
            while(br.ready() == true){    
                int numero = Integer.parseInt(br.readLine());
                System.out.println(numero);
                total += numero;
                cont++;
            }
            double media = total/cont;
            System.out.println("Media: " + media);
            
        }catch(FileNotFoundException ex){ 
            System.out.println(ex.getMessage());
        }catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }    
            
         
        
        
    }
    
}
