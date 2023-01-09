/**
 * 
 */
package Recursividad;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ejercicio01 {

	/*Suma los numeros naturales hasta N
	 * @param
	 * @return
	 */
	static int sumaNaturales(int num) {
		int suma = 0;
		if(num == 1)
			return 1;
		else
		return num + sumaNaturales(num-1);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		int num = scan.nextInt();
		
		System.out.println(sumaNaturales(num));
	}

}
