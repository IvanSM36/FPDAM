/**
 * 
 */
package Tema4;

import java.util.*;

/**
 * @author IvanSM
 *
 */
public class Ej01Pseudo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int opc, n1, n2, s, r, m ;
		double d;

		System.out.println("MENU DE OPERACIONES");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.print("Elija una opcion: ");

		opc = scan.nextInt();

		System.out.print("Introduzca el primer numero: ");
		n1 = scan.nextInt();
		System.out.println("Introduzca el segundo numero");
		n2 = scan.nextInt();

		if (opc == 1) {
			s = n1 + n2;
			System.out.println("El resultado es: " + s);
		}

		if (opc == 2) {
			r = n1 - n2;
			System.out.println("El resultado es: " + r);
		}
		if (opc == 3) {
			m = n1 * n2;
			System.out.println("El resultado es: " + m);
		}
		if (opc == 4) {
			d = n1 / n2;
			System.out.println("El resultado es: " + d);
		}
	}

}
