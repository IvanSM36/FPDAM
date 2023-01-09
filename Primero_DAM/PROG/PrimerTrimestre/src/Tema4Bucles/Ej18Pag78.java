/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej18Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int num2 = 0;

		do {
			System.out.println("Introduzca el primer numero: ");
			num = scan.nextInt();
			System.out.println("Introduzca el segundo numero:");
			num2 = scan.nextInt();

			if (num < num2) {	//Si el num es mmenor que num2 empezara a contar desde num que es menor hasta num2
				for (int i = num; i <= num2; i += 7) { 	//El contador estara iniciado igual al num, hasta num2  e irá sumando de 7 en 7.
					System.out.println(i);
				}
			} else {
				for (int i = num2; i <= num; i += 7) {
					System.out.println(i);
				}
			}

		} while (num == num2);

	}

}
