package Tema4Bucles.Relacion2;
/**
 * 
 */

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej08Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa muestra todos los numeros hasta llegar al numero insertado.");
		
		System.out.println("Introduzca un numero: ");
		int num = scan.nextInt();
		
		for (int i = 0; i <= num; i++) {
			
			System.out.println(i);
			
		}
		
	}

}
