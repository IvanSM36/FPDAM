/**
 * 
 */
package Tema4Bucles.Relacion1;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej05Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca el numero a multiplicar: ");
		int num = scan.nextInt();
		
		for(int i = 0; i <=10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
