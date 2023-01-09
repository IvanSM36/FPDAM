/**
 * 
 */
package Recursividad;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ejercicio08 {

	/*
	 * 
	 */
	public static void tableMultiplication(int TABLE, int LENGTH) {

		if (LENGTH > 1) {
			tableMultiplication(TABLE, LENGTH - 1);
		}

		if ((TABLE * LENGTH) <= 12) {

			System.out.printf("%d x %d = %d \n", TABLE, LENGTH, (TABLE * LENGTH));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;

		System.out.print("Pida la tabla de multiplicar: ");
		num = scan.nextInt();
		tableMultiplication(num, 10);
		scan.close();
	}

}
