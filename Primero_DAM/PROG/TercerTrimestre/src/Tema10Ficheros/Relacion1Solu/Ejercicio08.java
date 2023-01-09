package Tema10Ficheros.Relacion1Solu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ang
 * 
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fichero = args[0];
        
             
        try
        
        	{
        	BufferedReader br = new BufferedReader(new FileReader(fichero));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero + "_sort.txt"));    
           
            ArrayList<String> lista = new ArrayList<>();
            
            while(br.ready() == true){
                lista.add(br.readLine());
            
                Collections.sort(lista);
                System.out.println(lista);
            }
            for(String st : lista){
                bw.write(st);
                bw.newLine();
            }
            br.close();
            bw.close();
            
        }catch(FileNotFoundException ex){ 
            System.out.println(ex.getMessage());
        }catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
            
        
        
        
        
    }
    
}
