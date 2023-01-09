/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej10Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int media = 0;
		int suma = 0;
		int aux = 0;
		int ultimo = 0;
		int sumaFinal = 0;
		for(int i = 1; num >= 0; i++) {
			System.out.println("Para salir introduzca un numero negativo");
			System.out.print("Introduzca un numero: ");
			num = scan.nextInt();
			aux = Math.abs(num); //Math.abs() convierte numero negativo en positivo.

			suma = (suma + num) ;	//Hace la suma incluyendo el numero negativo por lo que restaria el numero negativo
			sumaFinal = suma + aux; //Le sumamos a la suma el numero restado anteriormente por ser negativo
			media = sumaFinal /2 ;
		}	
		
		System.out.println("La media de los numeros introducidos es: " + media);

	}

}
