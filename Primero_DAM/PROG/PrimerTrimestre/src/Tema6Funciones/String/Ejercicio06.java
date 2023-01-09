package Tema6Funciones.String;

/* 
*@author 

          Ejercicio 6
          **********************************
				
			Como el programa anterior,
			pero en este caso hay que seleccionar la primera palabra de la frase 
			y concatenarla al final de la misma frase.
			
		  ***********************************************
		  
		  
*/

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);

		int i = 0;
		String palabra = "";
		String cadena = "";
		String cadenanew = "";
		boolean noespacio = true;
		int longitud = 0;
		do {
			System.out.println("**************************************************");
			System.out.println("Introduce una  cadena de caracteres mayor de 15 caracteres ");
			System.out.println("**************************************************");
			cadena = consola.nextLine();
			longitud = cadena.length();
			System.out.println("" + longitud);

		} while (longitud <= 14);

		do {

			if ((cadena.charAt(i) == ' ')) {
				noespacio = false;

			}
			palabra = cadena.substring(0, i);// devuelve el substring entre las posiciones 0,i
			i++;
		} while (noespacio);

		System.out.println("**************************************************");
		System.out.println("La primera palabra es  ");
		System.out.println("**************************************************");
		System.out.println(palabra);
		cadenanew = cadena.concat(palabra);
		System.out.println("**************************************************");
		System.out.println("la cadena completa es   ");
		System.out.println("**************************************************");
		System.out.println(cadenanew);

	}
}
