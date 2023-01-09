/**
 * 
 */
package Tema6Funciones.AJCE;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej17Pag166 {
	// Funciones
	/**
	 * Pasa un parametro binario a decimal
	 * 
	 * @param int return int
	 */
	public static int binDecimal(int bin) {
		int decimal = 0;
		int expo = 0;
		int digito;
		while (bin != 0) {
			// se toma la última cifra
			digito = bin % 10;
			// se multiplica por la potencia de 2 correspondiente y se suma al número
			decimal = decimal + digito * (int) Math.pow(2, expo);
			// se aumenta el exponente
			expo++;
			// se quita la última cifra para repetir el proceso
			bin = bin / 10;
		}
		return decimal;
	}

	/**
	 * Comprueba que el parametro introducido sea binario
	 * 
	 * @param int return boolean
	 */
	public static boolean esBinario(int bin) {
		boolean binario = true;
		int aux = bin;
		int digito = bin;
		while (aux != 0) {
			digito = aux % 10; // última cifra del números
			if (digito != 0 && digito != 1) { // si no es 0 ó 1
				binario = false; // no es un número binario
			}
			aux = aux / 10; // quitamos la última cifra para repetir el proceso
		}
		return binario;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int binario = 2;
		do {
			System.out.println("Introduzca un numero binario: ");
			binario = scan.nextInt();
			if (!esBinario(binario))
				System.out.println("Error, el numero introducido no es binario.");
		} while (!esBinario(binario));
		
		if(esBinario(binario)) {
			System.out.print("Binario: " + binario);
			System.out.println();
			System.out.print("Decimal: " + binDecimal(binario));
		}
	}

}
