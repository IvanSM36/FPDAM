/**
 * 
 */
package Tema4;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class Ej02Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca la hora: ");
		int hora = scan.nextInt();
		
		if(hora >= 6 && hora <= 12) {
			System.out.println("Buenos dias. :)");			
		}else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes. ;)");
		}else if(hora >= 21 && hora <= 23 ) {
			System.out.println("Buenas noches. ^^");
			
		}else if (hora >=0 && hora <= 5){
			System.out.println("Buenas noches. ^^");
		}else {
			System.out.println("Introduzca un horario entre 0 y 23");
		}
		
		
	}

}
