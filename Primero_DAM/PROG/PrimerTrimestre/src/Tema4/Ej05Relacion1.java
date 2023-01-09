/**
 * 
 */
package Tema4;

import java.util.*;

/**
 * @author IvanSM
 *
 */
public class Ej05Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Intropduzca la nota de tu primer examen: ");
		int nota = scan.nextInt();
		System.out.print("Introduzca la nota de tu segundo numero: ");
		int nota2 = scan.nextInt();
		System.out.print("Introduzca la nota de tu tercer numero: ");
		int nota3 = scan.nextInt();

		int media = (nota + nota2 + nota3) / 3;

		if (media >= 0 && media <= 4) {
			System.out.println("Insuficiente");
		} else if (media == 5) {
			System.out.println("Suficiente");
		}else if (media >=6 && media <=7) {
			System.out.println("Bien");
		}else if (media >=8 && media <=9) {
			System.out.println("Notable");
		}else if (media == 10) {
			System.out.println("Sobresaliente");
		}
	}

}
