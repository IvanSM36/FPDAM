/**
 * 
 */
package Recursividad;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ejercicio04 {
	static int invertirNumero(int num) {
		if(num < 10) {
			return num;
		} else {
			return  (num % 10) + (invertirNumero(num /10)*10);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.print("Introduzca un numero: ");
			int num = scan.nextInt();
			
			System.out.println(invertirNumero(num));
	}

}
