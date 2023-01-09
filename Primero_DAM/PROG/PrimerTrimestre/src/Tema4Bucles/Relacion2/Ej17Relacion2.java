/**
 * 
 */
package Tema4Bucles.Relacion2;

import java.util.Scanner;

/**
 * @author IvanSM
 *
 */
public class Ej17Relacion2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int cuentaPares = 0;
		int cuentaImpares = 0;
		
		System.out.println("Este programa cuenta los numeros impares y los pares del numero introducido.");
		
		System.out.print("Introduce un numero: ");
		num = scan.nextInt();
		int aux = num;
		
		while(num > 0) {
			if((num % 10)% 2 == 0) { //Se divide entre 10 para separar los digitos y luego compara si es para cada uno 
				cuentaPares ++;
			}else {
				cuentaImpares ++;
			}			
			num /= 10;
		}
		System.out.println("El numero " + aux + " contiene " + cuentaPares + " numeros pares ");
		System.out.println("El numero " + aux + " contiene " + cuentaImpares + " numeros impares ");
	    
	    
	}

}
