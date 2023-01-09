/**
 * 
 */
package Tema4;

import java.util.*;

/**
 * @author IvanSM
 *
 */
public class Ej11Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca dia de nacimiento: ");
		int dia = scan.nextInt();
		System.out.print("Introduzca mes de nacimiento: ");
		String mes = scan.next();

		if (mes.equals("enero") && dia <= 20) {
			System.out.println("Eres Capricornio.");
		} else if (mes.equals("febrero") && dia <= 21) {
			System.out.println("Eres Acuario.");
		} else if (mes.equals("marzo") && dia <= 20) {
			System.out.println("Eres Piscis");
		} else if (mes.equals("abril") && dia <= 21) {
			System.out.println("Eres Aries");
		} else if (mes.equals("mayo") && dia <= 21) {
			System.out.println("Eres Tauro");
		} else if (mes.equals("junio") && dia <= 22) {
			System.out.println("Eres Gemenis");
		} else if (mes.equals("julio") && dia <= 22) {
			System.out.println("Eres Cancer");
		} else if (mes.equals("agosto") && dia <= 23) {
			System.out.println("Eres Leo");
		} else if (mes.equals("septiembre") && dia <= 24) {
			System.out.println("Eres Virgo");
		} else if (mes.equals("octubre") && dia <= 24) {
			System.out.println("Eres Libra");
		} else if (mes.equals("noviembre") && dia <= 24) {
			System.out.println("Eres Escorpion");
		} else if (mes.equals("diciembre") && dia <=23) {
			System.out.println("Eres Sagitario");
		}

		scan.close();
	}

}
