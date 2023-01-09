package Tema10Exceptions.Prueba;

import java.util.Scanner;

public class Prueba02 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);	
		boolean esValido = false;
		System.out.println("Este programa pinta varias líneas de asteriscos");
		try {
			System.out.print("Introduzca el número total de asteriscos: ");	
			int asteriscos = Integer.parseInt(scan.nextLine());
			System.out.print("Introduzca el número de líneas que quiere pintar: ");
			int lineas = Integer.parseInt(scan.nextLine());
			
			int longitud = (asteriscos % lineas) == 0 ? asteriscos / lineas : (int)Math.ceil((double)asteriscos/ lineas);
			
			int cuentaAsteriscos = 0;
			
			for (int i = 1; i <= lineas; i++) {
				System.out.print("Línea " + i + ": ");
				for (int j = 0; (j < longitud) && (cuentaAsteriscos++ < asteriscos); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		catch (NumberFormatException nfe) {
			System.out.println("Los datos introducidos no son correctos");
			System.out.println("Se deben introducir numeros enteros");
		}
		catch (ArithmeticException ae) {
			System.out.println("El numero de Linea no puede ser 0 o nulo");
		}
		
		
	}

}
