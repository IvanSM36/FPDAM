/**
 * 
 */
package Tema4;

import java.util.*;

/**
 * @author IvanSM
 *
 */
public class Prueba04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca dia: ");
		int dia = scan.nextInt();
		System.out.print("Introduzca mes: ");
		int mes = scan.nextInt();
		System.out.println("Introduzca año: ");
		int anio = scan.nextInt();

		switch (mes) {
		case 1:
			if (dia >= 31) {
				System.out.println("Error, Enero tiene 31");
			}
			break;
		case 2:
			if (dia >= 28) {
				System.out.println("Error, Febrero tiene 28");
			}
			break;
		case 3:
			if (dia >= 31) {
				System.out.println("Error, Marzo tiene 31");
			}
			break;
		case 4:
			if (dia >= 30) {
				System.out.println("Error, Abril tiene 30");
			}
			break;
		case 5:
			if (dia >= 31) {
				System.out.println("Error, Mayo tiene 31");
			}
			break;
		case 6:
			if (dia >= 30) {
				System.out.println("Error, Junio tiene 30");
			}
			break;
		case 7:
			if (dia >= 31) {
				System.out.println("Error, Julio tiene 31");
			}
			break;

		case 8:
			if (dia >= 30) {
				System.out.println("Error, Agosto tiene 30");
			}
			break;
		case 9:
			if (dia >= 31) {
				System.out.println("Error, Septiembre tiene 31");
			}
			break;
		case 10:
			if(dia >= 30) {
				System.out.println("Error, Ocubre tiene 30");
			}
			break;
		case 11:
			if(dia >= 31) {
				System.out.println("Error, Noviembre tiene 31");
			}
			break;
		case 12:
			if(dia >= 30) {
				System.out.println("Error, Diciembre tiene 30");
			}
			break;
		}
		System.out.println("");
	}

}

//pedir dia mes y a�o de una fecha e indica si la fecha es correcta con mesde de  28 30 y 31 dia sin a�os bisiestos