package Tema10Ficheros.Relacion1Solu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ang
 *
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        try{
        	
        	BufferedReader br = new BufferedReader(new FileReader("fichero1.txt"));    
            BufferedReader br2 = new BufferedReader(new FileReader("fichero2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("mezcla.txt"));    
            
            while(br.ready() == true && br2.ready() == true){
            	
                String linea1 = br.readLine();
                String linea2 = br2.readLine();
                
                bw.write(linea1);
                bw.newLine();
                bw.write(linea2);
                bw.newLine();
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
