/**
 * 
 */
package Tema4Bucles.Relacion1;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class Ej03Relacion1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int positivos = 0;
		int negativos = 0;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print("Introduzca un numero: ");
			int num = scan.nextInt();
			
			if(num > 0) {
				positivos ++;
			} else {
				negativos ++;
			}
		}
		System.out.println("Se ha introducido: " + positivos + " positivos");
		System.out.println("Se ha introducido: " + negativos + " negativos");
		scan.close();		
	}

}
