/**
 * 
 */
package Tema5.Pajarito;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej03Pag75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//Variables
		int contaCeros = 0;
		int contaPos = 0;
		int contaNeg = 0;
		int sumaPos = 0;
		int sumaNeg = 0;
		int mediaPositivo = 0;
		int mediaNegativo = 0;
		int numeros[] = new int[5];

		// Rellenamos el array numeros y calculamos las medias y contamos los ceros.
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduzca un numero para la posicion " + i + " del array: ");
			numeros[i] = scan.nextInt();
			if (numeros[i] > 0) {
				contaPos++;
				sumaPos += numeros[i];
				mediaPositivo = sumaPos / contaPos;
			} else if (numeros[i] < 0) {
				contaNeg++;
				sumaNeg += numeros[i];
				mediaNegativo = sumaNeg / contaNeg;
			} else {
				contaCeros++;
			}
		}
		// Mostramos contenido del array numeros
		System.out.println();
		System.out.println("Contenido del array numeros original.");
		System.out.println("---------------------------------");
		System.out.print("Indice: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%5s", i);
		}
		System.out.println();
		System.out.print("Valor:  ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%5s", numeros[i]);
		}
		System.out.println();
		System.out.println();
		// Mostramos Resultados.
		System.out.println("Resultado");
		System.out.println("---------------------");
		System.out.println("La media de los positivos es: " + mediaPositivo);
		System.out.println("La media de los negativos es: " + mediaNegativo);
		System.out.println("Se ha introducido " + contaCeros + " ceros.");

	}

}
