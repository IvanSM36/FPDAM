/**
 * 
 */
package Tema4;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej01Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Introduzca un dia de la semana: ");
		Scanner scan = new Scanner(System.in);
		int numSem = scan.nextInt();
		String asignatura;

		switch (numSem) {
		case 1:
			asignatura = "Programacion";
			break;
		case 2:
			asignatura = "Lenguaje de Marcas";
			break;
		case 3:
			asignatura = "Base de datos";
			break;
		case 4:
			asignatura = "Sistema Informatico";
			break;
		case 5:
			asignatura = "Programación";
			break;
		default:
			asignatura = "Introduzca un dia de la semana entre 1-5.";

		}

		System.out.println(asignatura);

	}

}
