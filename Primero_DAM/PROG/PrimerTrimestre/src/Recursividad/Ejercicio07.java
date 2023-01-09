/**
 * 
 */
package Recursividad;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ejercicio07 {

	/*
	 * 
	 */
	public static int sumaDigitos(int num) {
		if (num < 10) { //
			return num; //Devuelvo el numero
		}
		return (num % 10) + sumaDigitos(num/10); // Cojo el digito y llamo a la funcion
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = scan.nextInt();
	    System.out.println(sumaDigitos(num));
		
	}

}
