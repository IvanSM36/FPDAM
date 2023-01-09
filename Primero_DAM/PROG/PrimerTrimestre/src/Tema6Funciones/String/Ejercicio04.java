package Tema6Funciones.String;

/* 
*@author 
          Ejercicio 4
          **********************************
              Programa que lea dos cadenas de caracteres del teclado y diga si son
              iguales o no.
          ***********************************
          * 
          * metodo  int string.compareTo(string s);
          *  Número positivo: la cadena 1 es mayor que la cadena 2.
                                      0: las cadenas son iguales.
              Número negativo: la cadena 1 es menor que la cadena 2.
          * 
   

*
*/
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in); // Declaracion de variables
		int i = 0;
		System.out.println("**************************************************");
		System.out.println("Introduce dos cadena de caracteres para indicar si son iguales");
		System.out.println("**************************************************");

		System.out.println("Introduce Cadena1");
		String cadena1 = consola.next();
		System.out.println("Introduce Cadena2");
		String cadena2 = consola.next();

		i = cadena1.compareTo(cadena2); // compara si dos cadenas son iguales 0,
		if (i == 0) {
			System.out.println("Las dos cadenas son iguales");
		} else {
			System.out.println("Las dos cadenas no son iguales");
		}

	}
}
