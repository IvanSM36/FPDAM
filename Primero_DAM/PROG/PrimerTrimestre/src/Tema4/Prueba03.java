/**
 * 
 */
package Tema4;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class Prueba03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca un mes: ");
		
		int mesNum = scan.nextInt();
		String mes;
		
		switch (mesNum) {
			case 1 :
				mes = "Enero";
				break;
			case 2 :
				mes = "Febrero";
				break;
			case 3 :
				mes = "Marzo";
				break;
			case 4 :
				mes = "Abril";
				break;
			case 5 :
				mes = "Mayo";
				break;
			case 6 :
				mes = "Junio";
				break;
			case 7 :
				mes = "Julio";
				break;
			case 8 :
				mes = "Agosto";
				break;
			case 9 :
				mes = "Septiembre";
				break;
			case 10 :
				mes = "Octubre";
				break;
			case 11 :
				mes = "Noviembre";
				break;
			case 12 :
				mes = "Diciembre";
				break;
			default: mes = "Introduzca un mes entre 1-12.";
			
		}
		System.out.println(mes);
	}

}
