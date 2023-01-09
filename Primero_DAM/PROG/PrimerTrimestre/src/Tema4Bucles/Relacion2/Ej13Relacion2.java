/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej13Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int aprobados = 0;
		int condicionados = 0;
		int suspensos = 0;
		
		System.out.println("Este programa indica la cantidad de aprobados.");
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Introduzca la nota: ");
			int num = scan.nextInt();
			
			if(num >=5)
				aprobados ++;
			if(num == 4)
				condicionados ++;
			if(num < 4)
				suspensos ++;
		}
		
		System.out.println("Cantidad de alumnos aprobados: " + aprobados);
		System.out.println("Cantidad de alumnos condicionados: " + condicionados);
		System.out.println("Cantidad de alumnos suspensos: " + suspensos);

	}

}
