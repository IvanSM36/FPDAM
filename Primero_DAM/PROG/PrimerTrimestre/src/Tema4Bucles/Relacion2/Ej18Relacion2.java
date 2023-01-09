/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej18Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i ++) {	
			System.out.println();
			System.out.println("Tabla de multiplicar del: " + i);
			System.out.println("-----------------------------");
			System.out.println();
			for (int j = 1; j <= 10; j++)
			System.out.println(i + " * " + j + " = " + i*j);
		}
		
	}

}
