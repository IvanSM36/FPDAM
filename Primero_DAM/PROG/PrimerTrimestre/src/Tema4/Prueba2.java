/**
 * 
 */
package Tema4;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class Prueba2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca dia de la semana: ");
		String dia = scan.nextLine();
		
		if(dia.equals("lunes") || dia.equals("viernes")) {
			System.out.println("Programación");
		}else if(dia.equals("martes") || dia.equals("jueves")) {
			System.out.println("LGMSI");
		}else if (dia.equals("miercoles")) {
			System.out.println("BADA");
		}else {
			System.out.println("Introduzca un dia de la semana.");
		}
		
		
	}

}
