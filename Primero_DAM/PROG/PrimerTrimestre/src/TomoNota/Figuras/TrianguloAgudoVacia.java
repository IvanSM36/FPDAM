/**
 * 
 */
package TomoNota.Figuras;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class TrianguloAgudoVacia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("Introduzca la altura de la figura: ");
	    int altura = scan.nextInt();

	    // Primera línea
	    for (int i = 0; i < altura; i++) {
	      System.out.print("*");
	    }
	    System.out.println();

	    // Parte intermedia
	    for (int i = 1; i < altura - 1; i++) {
	      System.out.print("*");//Pinta el lado izquierdo del medio
	      for (int j = 0; j < altura - i - 2; j++) {
	        System.out.print(" ");//Pinta el relleno
	      }
	      System.out.println("*");//Pinta el lado derecho
	    }
	    
	    // Vértice inferior
	    System.out.println("*");
	}

}
