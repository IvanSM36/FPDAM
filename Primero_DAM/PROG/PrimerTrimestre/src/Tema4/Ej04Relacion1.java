/**
 * 
 */
package Tema4;

import java.util.*;

/**
 * @author IvanSM
 *
 */
public class Ej04Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca la horas trabajadas: ");
		int horas = scan.nextInt();

		int sueldoH = 12;
		int sueldoHe = 16;
		int horasOrdi = 40;
		int horasExtra;
		int total;
		
		if (horas <= 40 && horas >= 0) {
			total = horas * sueldoH;
			System.out.println(total);

		} else if (horas >= 41) {
			horasExtra = horas - horasOrdi;
			total = (horasExtra * sueldoHe) + (horasOrdi * sueldoH);
			System.out.println(total);
		} else {
			System.out.println("Introduzca un sueldo mayor a 0");
		}

	}

}
