/**
 * 
 */
package Tema5.Relacion1;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej05Relacion1 {

	/**
	 * Realiza un programa que sea capaz de rellenar una matriz 4x4 con cadenas de
	 * caracteres, y sea capaz de devolver la cadena que contenga las 5 vocales
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inicializamos las variables
		String[][] arrayCadena = new String[4][4];// Declaración del array bidimensional
		String[][] arrayAuxiliar = new String[4][4];// Necesario para volcar los arrays que contengan 5 vocales
		boolean palabra5Vocales = false;
		String cadena = "";
		// Objeto de la clase Scanner
		Scanner escaneo = new Scanner(System.in);

		// Rellenamos el array cadenas
		for (int i = 0; i < arrayCadena.length; i++) {
			for (int j = 0; j < arrayCadena[i].length; j++) {

				// Pedimos los valores a introducir por teclado, para rellenar la matriz de
				// cadenas de caracteres
				System.out.println("Introduzca una cadena: ");
				cadena = escaneo.next();
				arrayCadena[i][j] = cadena;

			}
		}

		// Recorremos el array y vemos si alguna palabra tiene las 5 vocales
		for (int i = 0; i < arrayCadena.length; i++) {
			for (int j = 0; j < arrayCadena[i].length; j++) {

				String cadAux = arrayCadena[i][j].toUpperCase();

				if (cadAux.indexOf('A') != -1 && cadAux.indexOf('E') != -1 && cadAux.indexOf('I') != -1
						&& cadAux.indexOf('O') != -1 && cadAux.indexOf('U') != -1) {

					arrayAuxiliar[i][j] = cadAux;
					if (arrayAuxiliar[i][j].length() != 0) {
						palabra5Vocales = true;
					}
				}
			}
		}

		// Si existe una palabra con 5 vocales, la imprimo
		if (palabra5Vocales) {

			System.out.println("Existen elementos que contienen 5 vocales");
			for (int i = 0; i < arrayAuxiliar.length; i++) {
				for (int j = 0; j < arrayAuxiliar[i].length; j++) {

					if (arrayAuxiliar[i][j] != null) {
						System.out.println("***********" + arrayAuxiliar[i][j]);
					}
				}
			}
		}
	}

}
