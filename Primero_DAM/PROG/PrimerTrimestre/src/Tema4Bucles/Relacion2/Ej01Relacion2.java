/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej01Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int cuadrado = 0;
		
		System.out.println("Este programa muestra el numero insertado eleveado al cuadrado.");
		System.out.println("Para salir del programa introduzca un numero negativo.");
		
		do {
			System.out.print("Introduzca un numero:");
			num = scan.nextInt();
			cuadrado = num * num;
			System.out.println(num + "^2" + " = " + cuadrado);
			
			if(num < 0) {
				System.out.println("Fin del programa.");
			}
			
		}while(num > 0);
			
		
	}

}
