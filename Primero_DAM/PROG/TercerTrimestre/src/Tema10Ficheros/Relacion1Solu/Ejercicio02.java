package Tema10Ficheros.Relacion1Solu;

/**
 * 2. Realiza un programa que lea el fichero creado en el ejercicio anterior y
 *    que muestre los números por pantalla.
 *
 * @author 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Ejercicio02 {
  public static void main(String[] args) {
	  
    try {
    	
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      
      String linea = "";
      while (linea != null) {
        System.out.print(linea + " ");
        linea = br.readLine();
      } 
      System.out.println();
      br.close();
      
    } catch (IOException e) {
      System.out.println("Error de lectura.");
    }
    
  }
}
