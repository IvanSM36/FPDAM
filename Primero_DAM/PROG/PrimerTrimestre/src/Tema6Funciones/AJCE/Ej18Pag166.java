/**
 * 
 */
package Tema6Funciones.AJCE;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej18Pag166 {
	// Funciones
	/**
	 * Pasa un parametro decimal a binario
	 * 
	 * @param int return int
	 */
	public static double decimalBin(int num) {
		int exp = 0;
		double binario = 0;
		int digito;
		while (num != 0) {
			digito = num % 2;
			binario = binario + digito * Math.pow(10, exp);
			exp++;
			num = num / 2;
		}
		return binario;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.print("Introduce un numero entero >= 0: ");
			num = scan.nextInt();
		} while (num < 0);

		System.out.print("Decimal: " + num);
		System.out.println();
		System.out.printf("Binario: %.0f", decimalBin(num));
		
	}

}
