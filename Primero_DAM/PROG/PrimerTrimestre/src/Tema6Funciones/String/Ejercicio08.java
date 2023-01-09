package Tema6Funciones.String;

/* 
*@author 
				**********************************
					Ejercicio 8
				Verificar si una cadena de texto almacenada en la String nif,
				es un NIF correcto o no.
				 Si lo es:
				 se mostrará por consola su parte numérica; si no lo es se mostrará el mensaje "NIF no valido".
				 Se tendrá en cuenta lo siguiente:
				Suponer que los NIFs tienen 8 dígitos y, a continuación, 
				una letra (no importa que sea mayúscula o minúscula).
				Usar los métodos 
						isLetter(char c) y isDigit(char c).
				Estos son métodos estáticos 
				por lo que se utilizan como String.isLetter(‘caracter’) y String.isDigit(‘caracter’)
				for (int i = 0; i < s.length(); i++)
						if (isLetter(s.charAt(i) ) ) {
		****************************************************

*/

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// variables

		Scanner consola = new Scanner(System.in);
		String cadena = "";
		String nif = "";
		int longitud = 0;
		int i = 0;
		int contador = 0;
		boolean correcto = true; // para comprobar que la cadena introducida es correcta

		do {

			System.out.println("**************************************************");
			System.out.println("Introduce tu nif : 8 digitos y acontinuacion una letra ");
			System.out.println("**************************************************");
			cadena = consola.nextLine();
			longitud = cadena.length();
			System.out.println(longitud); // comprobamos la numeracion 12345678P minima de 8 caracteres

		} while (longitud != 9);
		// Método que comprueba que el carácter pasado como parámetro es una letra.
		// Si es una letra devuelve true, si no devuelve false.
		longitud--;
		// Character.isLetter(sPalabra.charAt(x)
		do {
			System.out.println(cadena.charAt(i));
			if (Character.isDigit(cadena.charAt(i))) {

				i++;
			} else {

				System.out.println("Error no ha introducio una numeracion correcta");
				correcto = false;

			}

		} while (correcto && (i < longitud));

		if (correcto && (Character.isLetter(cadena.charAt(i)))) {// tras leer los 8 digitos compruebo que la letrta es
																	// la correcta
			System.out.println("Nif introducido es correcto");
		} else {

			System.out.println("la letra del nif no es correcta");
		}

	}

}