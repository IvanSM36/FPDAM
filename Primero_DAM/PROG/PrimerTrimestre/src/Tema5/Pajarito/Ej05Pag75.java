/**
 * 
 */
package Tema5.Pajarito;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej05Pag75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numeros[] = new int[5];
		int numeros2[] = new int[5];
		int mezcla[] = new int[10];
		int j = 0;

		// Rellenamos el array numeros y calculamos las medias y contamos los ceros.
		System.out.println("Rellena el array numeros");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduzca un numero para la posicion " + i + " del array: ");
			numeros[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("Rellena el array numeros2");
		// Rellenamos el array numeros2 y calculamos las medias y contamos los ceros.
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print("Introduzca un numero para la posicion " + i + " del array2: ");
			numeros2[i] = scan.nextInt();
		}

		// Mezclamos los valores de los arrays en uno nuevo.
		// Para ello necesitamos un array con el doble de espacio.
		for (int i = 0; i < numeros.length; i++) {		
			mezcla[j] = numeros[i];
			j ++;
			mezcla[j] = numeros2[i];
			j ++;
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

		// Mostramos contenido del array numeros2
		System.out.println();
		System.out.println("Contenido del array numeros2 original.");
		System.out.println("---------------------------------");
		System.out.print("Indice: ");
		for (int i = 0; i < numeros2.length; i++) {
			System.out.printf("%5s", i);
		}
		System.out.println();
		System.out.print("Valor:  ");
		for (int i = 0; i < numeros2.length; i++) {
			System.out.printf("%5s", numeros2[i]);
		}

		System.out.println();
		System.out.println();

		// Mostramos contenido del array mezcla
		System.out.println();
		System.out.println("Contenido del array mezcla.");
		System.out.println("---------------------------------");
		System.out.print("Indice: ");
		for (int i = 0; i < mezcla.length; i++) {
			System.out.printf("%5s", i);
		}
		System.out.println();
		System.out.print("Valor:  ");
		for (int i = 0; i < mezcla.length; i++) {
			System.out.printf("%5s", mezcla[i]);
		}
	}

}
