package Tema6Funciones.String;

/*
*@author 

          Ejercicio 3
          *********************
            Crear un programa que lea del teclado una cadena de caracteres 
            y la escriba al revés.
		  *************************
*
* */
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		System.out.println("Introduce una cadena de caracteres para mostrartela al revés");
		Scanner consola = new Scanner(System.in);
		String cadena = consola.next();

		int longitud = cadena.length(); // longitud de la cadena para poder recorrerla i
		longitud--;

		for (int i = longitud; i >= 0; i--) { // Recorremos la cadena al reves
			char caracteraux = cadena.charAt(i);
			System.out.print("" + caracteraux);

		}
	}

}