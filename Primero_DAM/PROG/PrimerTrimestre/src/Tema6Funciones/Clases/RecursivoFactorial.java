/**
 * 
 */
package Tema6Funciones.Clases;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class RecursivoFactorial {

	/*
	 * MetodoRecursivo Factorial
	 * 
	 * @param
	 * 
	 * @return
	 */
	public static int factorialRecur(int num) {
		if(num == 0)
			return 1;
		else
		return num * factorialRecur(num-1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un numero para calcular el factorial: ");
		int num = scan.nextInt();			
		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		System.out.println("El numero factorial es: " + factorial);
		
		System.out.println("El numero factorial es: " + factorialRecur(num));
	}

}
