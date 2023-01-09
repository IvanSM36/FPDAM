package Tema6Funciones.String;

/* 
*@author 

          Ejercicio 7
          **********************************
		 
			Programa que lea una cadena de caracteres del teclado y muestre sus siglas en mayúscula.
			Ademas  vamos a concatenar la cadena con todas las iniciales en mayusculas
			Por ejemplo: tren articulado ligero goicoechea oriol → TALGO
						Tren Articulado Ligero goicoechea Oriol...
		  ***********************************************
*/
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		String palabra = "";
		String cadena = "";
		String cadenanew = "";

		int longitud = 0;
		Scanner consola = new Scanner(System.in);
		String iniciales = "";

		System.out.println("**************************************************");
		System.out.println("Introduce una  cadena de caracteres ");
		System.out.println("**************************************************");
		cadena = consola.nextLine();
		longitud = cadena.length();
		System.out.println(longitud);

		// para el primer caracter lo convierte automaticamente
		palabra = cadena.substring(0, 1); // devuelve el substring entre las posiciones 0,i

		cadenanew = palabra.toUpperCase(); // concatena string que voy formando

		iniciales = iniciales.concat(palabra.toUpperCase());

		// para el resto de la cadena vamos a ir concatenando la nueva cadena convertida
		for (int i = 1; i < longitud; i++) { // recorre la cadena y muestras sus siglas en mayúsculas.
			int j = i + 1; // no es posible indicar en el metodo substring operadores en su interior
			int p = i + 2;

			if ((cadena.charAt(i) == ' ') && (i < (longitud - 1))) {

				palabra = cadena.substring(i, j);
				cadenanew = cadenanew.concat(palabra);
				palabra = cadena.substring(j, p);
				palabra = palabra.toUpperCase();
				iniciales = iniciales.concat(palabra);
				cadenanew = cadenanew.concat(palabra);

				i++;

			} else {
				palabra = cadena.substring(i, i + 1);
				cadenanew = cadenanew.concat(palabra);

			}
		}

		System.out.println("**************************************************");
		System.out.println("La cadena con las siglas en mayusculas es");
		System.out.println("**************************************************");
		System.out.println(cadenanew);
		System.out.println("**************************************************");
		System.out.println("Las iniciales de la cadena en mayusculas");
		System.out.println("**************************************************");
		System.out.println(iniciales);

	}
}
