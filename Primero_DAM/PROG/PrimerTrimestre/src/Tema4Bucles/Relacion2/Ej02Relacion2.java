/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej02Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa indica si un numero es negativo o positivo.");
		System.out.println("Para salir introduzca un 0.");
		
		int num = 0;
		
		
		do {
			System.out.print("Introduzca un numero: ");
			num = scan.nextInt();
			
			if(num > 0) {
				System.out.println("El numero " + num + " es positivo.");
			}else if (num < 0) {
				System.out.println("El numero " + num + " es negativo.");
			}else {
				System.out.println("Fin del programa.");
			}
			
		}while(num !=0);
		
	}

}
