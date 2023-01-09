/**
 * 
 */
package TomoNota.Figuras;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Pintar155 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int altura = 0;
		int espacios = 0;
		
		System.out.println("Este programa dibuja 155.");	
		do {
			System.out.print("Introduzca la altura (minimo 5): ");
			altura = scan.nextInt();
			System.out.print("Introduzca numero de espacios entre numeros (minimo 1): ");
			espacios = scan.nextInt();
			if(altura < 5)
				System.out.println("Error, minimo de altura 5.");
			if(espacios < 1)
				System.out.println("Error, minimo de espacios 1");
			
		} while(altura < 5 || espacios < 1);
		
		 // Parte superior del 5 //////////////////////////
	    // Fila 1
	    System.out.print("*");
	    for (int i = 0; i < espacios; i++) {
	      System.out.print(" ");
	    }
	    System.out.print("****");
	    for (int i = 0; i < espacios; i++) {
	      System.out.print(" ");
	    }
	    System.out.println("****");

	    // Fila 2
	    System.out.print("*");
	    for (int i = 0; i < espacios; i++) {
	      System.out.print(" ");
	    }
	    System.out.print("*   ");
	    for (int i = 0; i < espacios; i++) {
	      System.out.print(" ");
	    }
	    System.out.println("*");

	    // Fila 3 (igual que la fila 1)
	    System.out.print("*");
	    for (int i = 0; i < espacios; i++) {
	      System.out.print(" ");
	    }
	    System.out.print("****");
	    for (int i = 0; i < espacios; i++) {
	      System.out.print(" ");
	    }
	    System.out.println("****");

	    // Parte inferior del 5 //////////////////////////
	    // Filas variables
	    for (int fila = 0; fila < altura - 4; fila++) {
	      System.out.print("*");
	      for (int i = 0; i < espacios; i++) {
	        System.out.print(" ");
	      }
	      System.out.print("   *");
	      for (int i = 0; i < espacios; i++) {
	        System.out.print(" ");
	      }
	      System.out.println("   *");
	    }

	    // Última fila (igual que la primera)
	    System.out.print("*");
	    for (int i = 0; i < espacios; i++) {
	      System.out.print(" ");
	    }
	    System.out.print("****");
	    for (int i = 0; i < espacios; i++) {
	      System.out.print(" ");
	    }
	    System.out.println("****");
	}

}
