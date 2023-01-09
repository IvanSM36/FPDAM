package Tema6Funciones.String;

/*
*@author 
          Ejercicio 2
          **************
          Crear un programa que lea del teclado una cadena de caracteres y
          muestre cuantas veces aparece la letra 'a' en dicha cadena.
        
*
* */
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		System.out.println("Introduce una cadena de caracteres");
		Scanner consola = new Scanner(System.in);
		String cadena = consola.nextLine();
		int longitud = cadena.length(); // longitud de la cadena para poder recorrerla
		int contador = 0; // indica el numero de veces que aparace el caracter
		boolean encontrado = cadena.contains("a");

		if (encontrado == true) {
			for (int i = 0; i < longitud; i++) {
				char caracteraux = cadena.charAt(i);
				if (caracteraux == 'a') { // leemos caracter a caracter de la cadena y comparamos con el caracter
					contador++;
				}
			}
			System.out.println("El caracter a aparece en la cadena " + contador + " veces");

		} else {
			System.out.println("El caracter no aparece en la cadena");
		}
	}
}