/**
 * 
 */
package Tema4;

import java.util.*;

/**
 * @author IvanSM
 *
 */
public class Ej10Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca la nota del primer examen: ");
		int nota = scan.nextInt();
		System.out.print("Introduzca la nota del segundo examen: ");
		int nota2 = scan.nextInt();
		int media = (nota + nota2) / 2;

		if (media >= 5) {
			System.out.println("Nota del primer examen: " + nota);
			System.out.println("Nota del segundo examen: " + nota2);
			System.out.println("Tu nota de Programacion es: " + media);

		} else if (media < 5) {
			System.out.print("¿Cual ha sido el resultado de la recuperacion? apto/ no apto: ");
			String recuperacion = scan.next();
			if (recuperacion.equals("apto")) {
				if (nota < 5) {
					nota = 5;
					media = (nota + nota2) / 2;
					System.out.println("Nota del primer examen: " + nota);
					System.out.println("Nota del segundo examen: " + nota2);
					System.out.println("¿Cual ha sido el resultado de la recuperacion? apto/ no apto: " + recuperacion);
					System.out.println("Tu nota de Programacion es: " + media);
				} else if (nota2 < 5) {
					nota2 = 5;
					media = (nota + nota2) / 2;
					System.out.println("Nota del primer examen: " + nota);
					System.out.println("Nota del segundo examen: " + nota2);
					System.out.println("¿Cual ha sido el resultado de la recuperacion? apto/ no apto: " + recuperacion);
					System.out.println("Tu nota de Programacion es: " + media);
				}
			} if(recuperacion == "no apto") {
				System.out.println("Nota del primer examen: " + nota);
				System.out.println("Nota del segundo examen: " + nota2);
				System.out.println("¿Cual ha sido el resultado de la recuperacion? apto/ no apto: " + recuperacion);
				System.out.println("Tu nota de Programacion es: " + media);
			}else {
				System.out.println("Escribe apto o no apto.");
			}
		}
	}

}
