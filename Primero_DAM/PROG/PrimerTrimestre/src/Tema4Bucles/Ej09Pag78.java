/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej09Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i;
		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();
		
		
		
		for( i = 1; num >= 10; i ++) {
			num /=10;			
		}
		System.out.println("El numero introducido tiene " + i + " cifras" );
		
	}

}
