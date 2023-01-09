package Tema10Exceptions.Prueba;

import java.util.Scanner;

public class Prueba01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean datoValido = false;
		boolean datoValido2 = false;
		double num1 = 0;
		double num2 = 0;
		System.out.println("Este programa calcula la media d dos numeros");
		
		//Primer numero
		do {
			try {
				System.out.print("Introduzca el primer numero: ");
				num1 = Double.parseDouble(scan.nextLine());				
				datoValido = true;
							
			}			
			catch (Exception e) {
				System.out.println("No se puede calcular la media.");
				System.out.println("Los datos introducidos no son correctos.");
			}
		}while (!datoValido);
		
		//Segundo Numero
		do {
			try {
				datoValido = false;
				System.out.print("Introduzca el segundo numero: ");
				num2 = Double.parseDouble(scan.nextLine());
				datoValido = true;		
				
				System.out.println("La media es: " + (num1 + num2) / 2);			
			}			
			catch (Exception e) {
				System.out.println("No se puede calcular la media.");
				System.out.println("Los datos introducidos no son correctos.");
			}
		}while (!datoValido);
		

		
		
		
	}

}
