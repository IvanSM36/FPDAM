/**
 * 
 */
package TomoNota;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class PrimoONo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca un número entero y le diré si es primo: ");
	    int num = scan.nextInt();

	    boolean esPrimo = true;
	    
	    for (int i = 2; i < num; i++) {
	      if ((num % i) == 0) {
	        esPrimo = false;
	      }
	    }
	        
	    if (esPrimo) {
	      System.out.println("El número introducido es primo.");
	    } else {
	      System.out.println("El número introducido no es primo.");
	    }

	}

}
