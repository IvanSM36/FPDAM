/**
 * 
 */
package Tema5.Relacion1;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej01Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("ELIJA UNA OPCIÓN");
		System.out.println("1)Declarar y construir un array de enteros, de nombre arrDig1, que almacene del 0-9");
		System.out.println("2)Declarar y construir un array de enteros, de nombre arrDig2, que almacene los números del 9 al 0");
		System.out.println("3)Declarar y construir un array de caracteres, de nombre arrCh1, que almacene las 5 vocales en minúsculas");
		System.out.println("4)Declarar y construir un array de caracteres, con nombre arrCh2, que almacene las 5 primeras letras del abecedario en minúsculas");
		System.out.println("5)Concatenar las vocales del array arrChl a una cadena de caracteres de nombre cadCh1");
		System.out.println("6)Obtener una cadena de caracteres, de nombre cadCh2, con las 5 letras del array arrCh2");
		System.out.println("7)Mostrar por pantalla las cadenas con las 5 vocales y las 5 primeras letras del abecedario");
		System.out.println("8)Mostrar por pantalla un texto donde se intercalan las vocales con las cinco primeras letras del abecedario");
		System.out.println("9)Mostrar por pantalla el resultado de sumar cada posición del array arrDigl con su correspondiente en el array arrDig2");

		// Declaración de variables
		int[] arrDig1 = new int[10];
		char[] arrCh1 = { 'a', 'e', 'i', 'o', 'u' };
		char[] arrCh2 = { 'a', 'b', 'c', 'd', 'e' };
		String cadCh2 = new String(arrCh2);
		String cadCh3 = new String(arrCh1);
		int[] arrDig2 = new int[10];
		String cadCh1 = "hola";

		// Pedimos la opción por teclado
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();

		// Evaluamos las opciones del usuario
		switch (opcion) {

		case 1:

			// Declarar y construir un array de enteros, de nombre arrDig1, que almacene del
			// 0-9
			for (int i = 0; i < arrDig1.length; i++) {
				arrDig1[i] = i;
				System.out.print(arrDig1[i] + "");
			}
			break;

		case 2:

			// Declarar y construir un array de enteros, de nombre arrDig2, que almacene los
			// números del 9 al 0
			for (int i = 0; i < arrDig2.length; i++) {

				arrDig2[i] = arrDig2.length - 1 - i;
				System.out.println(arrDig2[i]);
			}

			break;

		case 3:

			// Declarar y construir un array de caracteres, de nombre arrCh1, que almacene
			// Llamo al metodo vovales5
			for (int i = 0; i < arrCh1.length; i++) {
				System.out.println(arrCh1[i]);
			}
			break;

		case 4:

			// Declarar y construir un array de caracteres, con nombre arrCh2, que almacene
			// las 5 primeras letras del abecedario en minúsculas
			for (int i = 0; i < arrCh2.length; i++) {
				System.out.println(arrCh2[i]);
			}
			break;

		case 5:

			// Concatenar las vocales del array arrChl a una cadena de caracteres de nombre
			// cadCh1
			for (int i = 0; i < arrCh1.length; i++) {
				cadCh1 += " " + arrCh1[i];
			}

			System.out.print(cadCh1);

			break;

		case 6:

			// Obtener una cadena de caracteres, de nombre cadCh2, con las 5 letras del
			// array arrCh2
			// System.out.println("Cadena 5 vocales: "+ cadChl);
			System.out.println("Cadena 5 primeras letras: " + cadCh2);

			break;

		case 7:

			// Mostrar por pantalla las cadenas con las 5 vocales y las 5 primeras letras
			// del abecedario

			System.out.print("Vocales: ");

			for (int i = 0; i < arrCh1.length; i++) {
				System.out.print(arrCh1[i]);
			}

			System.out.println();

			System.out.print("Letras: ");
			for (int i = 0; i < arrCh2.length; i++) {
				System.out.print(arrCh2[i]);
			}

			break;

		case 8:

			// Mostrar por pantalla un texto donde se intercalan las vocales con las cinco
			// primeras letras del abecedario
			String intercaladas = "";

			for (int i = 0; i < cadCh1.length(); i++) {
				intercaladas += cadCh1.charAt(i);
				intercaladas += cadCh2.charAt(i);
			}

			System.out.println("Vocales y letras: " + intercaladas);

			break;

		case 9:

			// Relleno arrDig1 en el caso9
			System.out.print("El primer array ******* ");
			for (int i = 0; i < arrDig1.length; i++) {
				arrDig1[i] = i;
				System.out.print(arrDig1[i]);

			}

			System.out.println();
			// Relleno arrDig2 en el caso9
			System.out.print("El segundo array ******* ");
			for (int i = 0; i < arrDig2.length; i++) {

				arrDig2[i] = arrDig2.length - 1 - i;
				System.out.print(arrDig2[i]);
			}

			System.out.println();
			// Mostrar por pantalla el resultado de sumar cada posición del array arrDigl
			// con su correspondiente en el array arrDig2
			for (int i = 0; i < arrDig1.length && i < arrDig2.length; i++) {
				System.out.println(
						"La suma de " + arrDig1[i] + " mas " + arrDig2[i] + " es: " + (arrDig1[i] + arrDig2[i]));
			}

			break;

		}

	}

}
