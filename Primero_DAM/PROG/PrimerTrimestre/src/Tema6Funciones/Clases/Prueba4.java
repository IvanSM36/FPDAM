package Tema6Funciones.Clases;
import java.util.Scanner;

public class Prueba4 {
	
	//Mis Metodos
	
	/* Declarar y construye un array de enteros, de nombre arrDig1, que almacene del 0-9
	 * @param
	 * @return
	 */
	public static void creaArray(int x[]) {
		for (int i = 0; i < x.length; i++) {
			x[i] = i;
			System.out.print(x[i] + "");
		}
		System.out.println();
	}
	/* Declarar y construye un array de enteros, de nombre arrDig1, que almacene del 0-9
	 * @param
	 * @return
	 */
	public static void creaArrayInversa(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array.length - 1 - i;
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	/* Declarar y construir un array de caracteres, de nombre arrCh1, que almacene las 5 vocales en min�sculas
	 * @param
	 * @return
	 */
	public static void vocales5(char array[]) {
		char[] arrCh1 = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < arrCh1.length; i++) {
			System.out.print(arrCh1[i] + " ");
		}
		System.out.println();
	}
	/* Declarar y construir un array de caracteres, con nombre arrCh2, que almacene las 5 primeras letras del abecedario en min�sculas
	 * @param
	 * @return
	 */
	public static void abc5(char array[]) {
		char[] arrCh2 = { 'a', 'b', 'c', 'd', 'e' };
		for (int i = 0; i < arrCh2.length; i++) {
			System.out.print(arrCh2[i] + " ");
		}
		System.out.println();
	}
	/* Concatenar las vocales del array arrChl a una cadena de caracteres de nombre cadCh1 
	 * @param
	 * @return
	 */
	public static void concatenaChar(char array[]) {
		char[] arrCh1 = { 'a', 'e', 'i', 'o', 'u' };
		String cadCh1 = "hola";
		for (int i = 0; i < arrCh1.length; i++) {
			cadCh1 += " " + arrCh1[i];
		}

		System.out.print(cadCh1);
	}
	/* 6) Obtener una cadena de caracteres, de nombre cadCh2, con las 5 letras del array arrCh2 
	 * @param
	 * @return
	 */
	public static void cadenaCar(char array[]) {
		char[] arrCh2 = { 'a', 'b', 'c', 'd', 'e' };
		String cadCh2 = new String(arrCh2);
		System.out.println("Cadena 5 primeras letras: " + cadCh2);
	}
	/* 7) Mostrar por pantalla las cadenas con las 5 vocales y las 5 primeras letras del abecedario
	 * @param
	 * @return
	 */
	public static void vocalesCadena(char array[]) {
		char[] arrCh2 = { 'a', 'b', 'c', 'd', 'e' };
		char[] arrCh1 = { 'a', 'e', 'i', 'o', 'u' };
		
		System.out.print("Vocales: ");
		for (int i = 0; i < arrCh1.length; i++) {
			System.out.print(arrCh1[i]);
		}

		System.out.println();

		System.out.print("Letras: ");
		for (int i = 0; i < arrCh2.length; i++) {
			System.out.print(arrCh2[i]);
		}
	}
	/* 8) Mostrar por pantalla un texto donde se intercalan las vocales con las cinco primeras letras del abecedario   
	 * @param
	 * @return
	 */
	public static void intercalan(char array[]) {
		char[] arrCh1 = { 'a', 'e', 'i', 'o', 'u' };
		char[] arrCh2 = { 'a', 'b', 'c', 'd', 'e' };
		String cadCh2 = new String(arrCh2);
		String cadCh3 = new String(arrCh1);

		String intercaladas = "";

		for (int i = 0; i < cadCh3.length(); i++) {
			intercaladas += cadCh3.charAt(i);
			intercaladas += cadCh2.charAt(i);
		}

		System.out.println("Vocales y letras: " + intercaladas);
	}
	/* 9) Mostrar por pantalla el resultado de sumar cada posici�n del array arrDigl con su correspondiente en el array arrDig2  
	 * @param
	 * @return
	 */
	public static void sumaArray(char array[]) {
		int[] arrDig1 = new int[10];
		int[] arrDig2 = new int[10];

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
		// Mostrar por pantalla el resultado de sumar cada posici�n del array arrDigl
		// con su correspondiente en el array arrDig2
		for (int i = 0; i < arrDig1.length && i < arrDig2.length; i++) {
			System.out.println("La suma de " + arrDig1[i] + " mas " + arrDig2[i] + " es: " + (arrDig1[i] + arrDig2[i]));
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(" Menu de arrays");
		System.out.println(" _____________________________________________________________________________________________________________________________________");
		System.out.println(" |                                                                                                                                    |");
		System.out.println(" | 1) Declarar y construir un array de enteros, de nombre arrDig1, que almacene del 0-9                                               |");
		System.out.println(" | 2) Declarar y construir un array de enteros, de nombre arrDig2, que almacene los n�meros del 9 al 0                                |");
		System.out.println(" | 3) Declarar y construir un array de caracteres, de nombre arrCh1, que almacene las 5 vocales en min�sculas                         |");
		System.out.println(" | 4) Declarar y construir un array de caracteres, con nombre arrCh2, que almacene las 5 primeras letras del abecedario en min�sculas |");
		System.out.println(" | 5) Concatenar las vocales del array arrChl a una cadena de caracteres de nombre cadCh1                                             |");
		System.out.println(" | 6) Obtener una cadena de caracteres, de nombre cadCh2, con las 5 letras del array arrCh2                                           |");
		System.out.println(" | 7) Mostrar por pantalla las cadenas con las 5 vocales y las 5 primeras letras del abecedario                                       |");
		System.out.println(" | 8) Mostrar por pantalla un texto donde se intercalan las vocales con las cinco primeras letras del abecedario                      |");
		System.out.println(" | 9) Mostrar por pantalla el resultado de sumar cada posici�n del array arrDigl con su correspondiente en el array arrDig2           |");
		System.out.println(" |____________________________________________________________________________________________________________________________________|");
		System.out.println();
		System.out.print(" Elige una opcion: ");
		System.out.println();

		// Declaraci�n de variables
		int[] arrDig1 = new int[10];
		char[] arrCh1 = new char[5];
		char[] arrCh2 = new char[5];	
		int[] arrDig2 = new int[10];

		// Pedimos la opci�n por teclado
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();

		// Evaluamos las opciones del usuario
		switch (opcion) {

		case 1:

			// Declarar y construir un array de enteros, de nombre arrDig1, que almacene del
			// Llamo al metodo creaArray
			creaArray(arrDig1);
			
			break;

		case 2:

			// Declarar y construir un array de enteros, de nombre arrDig2, que almacene los
			// LLamo al metodo creArrayInversa
			creaArrayInversa(arrDig2);

			break;

		case 3:

			// Declarar y construir un array de caracteres, de nombre arrCh1, que almacene
			// las 5 vocales en min�sculas
			vocales5(arrCh1);
			
			break;

		case 4:

			// Declarar y construir un array de caracteres, con nombre arrCh2, que almacene las 5 primeras letras del abecedario
			// LLamamos al metodo abc5
			abc5(arrCh2);
			
			break;

		case 5:

			// Concatenar las vocales del array arrChl a una cadena de caracteres de nombre
			// cadCh1
			// Llamamos al metodo concatenachar
			concatenaChar(arrCh1);

			break;

		case 6:

			// Obtener una cadena de caracteres, de nombre cadCh2, con las 5 letras del
			// array arrCh2	// System.out.println("Cadena 5 vocales: "+ cadChl);
			// Llamamos al metodo cadenaCar
			cadenaCar(arrCh2);
			break;

		case 7:

			// Mostrar por pantalla las cadenas con las 5 vocales y las 5 primeras letras
			// del abecedario
			// Llamamos al metodo vocalesCadena

			vocalesCadena(arrCh2);

			break;

		case 8:

			// Mostrar por pantalla un texto donde se intercalan las vocales con las cinco
			// primeras letras del abecedario
			// Llamamos al metodo intercalan
			
			intercalan(arrCh2);

			break;

		case 9:
			// Llamamos al metodo sumaArray
			sumaArray(arrCh2);
			break;

		}

	}

}
