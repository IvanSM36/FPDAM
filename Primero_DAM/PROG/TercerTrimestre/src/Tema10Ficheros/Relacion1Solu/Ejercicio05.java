package Tema10Ficheros.Relacion1Solu;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.time.*;
import java.util.Date;

/**
 *
 * @author Ang
 * 
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	//LocalDate fecha = LocalDate.now();
    	
        Date fecha = new Date();
        Format formato = new SimpleDateFormat("HH_mm_ss");
        String st = formato.format(fecha);
        System.out.println(st);
        
        try{
        	BufferedWriter bw = new BufferedWriter(new FileWriter(st+".txt", true));    
           
            for(int i = 0; i<5;i++){
                int auxiliar = (int)(Math.random()*100);
                bw.write(auxiliar + "");
                bw.newLine();
                System.out.println(auxiliar);
            }
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

