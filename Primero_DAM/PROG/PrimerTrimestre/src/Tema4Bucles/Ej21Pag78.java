/**
 * 
 */
package Tema4Bucles;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej21Pag78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;		
		int contadorImp = 0;
		int mayor = 0;
		int media = 0;
		int suma = 0;
		System.out.println("Para salir introduzca un numero negativo: ");
		
		do {
			System.out.print("Introduzca numeros: ");
			num = scan.nextInt();
			if(num % 2 == 0) {			
				if(num > mayor) {
					mayor = num;
				}			
			}else {
				contadorImp ++;
				suma +=num;
				media = suma /contadorImp;
			}
		} while (num > 0);

		
		System.out.println("El numero mayor de los pares es: " + mayor);
		System.out.println("La media de los numeros impares es: " + media);
	}

}
