package Tema6Funciones.String;

import java.util.Scanner;

/**
 * REALIZAR UNA FUNCION, A LA QUE SE LE PASE COMO PARAMETRO UN NUMERO "N", Y
 * MUESTRE POR PANTALLA "N" VECES "MóDULO EJECUTANDOSE"
 * 
 */

public class Ejercicio01 {

	public static Scanner teclado;

	/**
	 * Método que lee un número por teclado y lo devuelve
	 * 
	 * @param
	 * @return int
	 * 
	 */
	public static int leer_numero() {
		int numero;

		System.out.print("INDIQUE EL VALOR DEL NUMERO : ");
		numero = teclado.nextInt();

		return numero;
	}

	/**
	 * Método que imprime el número n veces
	 * 
	 * @param int
	 * @return
	 * 
	 */
	public static void n_veces(int n) {
		int i;

		for (i = 1; i <= n; i++) {
			System.out.println(i + " VECES : MODULO EJECUTANDOSE");
		}
	}

	/** Ejecución del programa- */
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		int n;

		n = leer_numero(); // Lectura del número por teclado
		n_veces(n); // Imprimimos n veces el número
	}
}