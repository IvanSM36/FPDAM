package Tema6Funciones.String;

/* 
*@author 
          Ejercicio 5
          **********************************
                Programa que lea una cadena de caracteres que al menos 15 caracteres, si
                no, tiene que volverla a introducir el usuario. 
                Una vez obtenida la cadena
                hay que contar el número de palabras que forman esa cadena,
                 e imprimir el resultado. 
                 Se supone que las palabras están separadas por un espacio
                en blanco y que una frase no se empieza nunca con un espacio.
                     
          ***********************************
 
*
*/
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in); // Declaracion de variables
		int longitud = 0;
		int espacios = 0;
		int palabras = 0;
		String cadena = "";

		do {
			System.out.println("**************************************************");
			System.out.println("Introduce una  cadena de caracteres mayor de 15 caracteres ");
			System.out.println("**************************************************");
			cadena = consola.nextLine();
			longitud = cadena.length();

		} while (longitud <= 14);

		for (int i = 0; i < longitud; i++) {
			if ((cadena.charAt(i) == ' ')) {

				espacios++;
			}
		}
		palabras = espacios + 1;
		System.out.println("la cadena tiene " + palabras + " palabras");

	}
}
