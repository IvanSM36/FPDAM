package Tema10Exceptions.Relacion1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean datoValido = false;
		double aux = 0;
		int contador = 0;
		
		do {
			try {
				do {
					System.out.print("Introduzca un numero: ");
					double num = Double.parseDouble(scan.nextLine());		
					datoValido = true;
					contador++;
					if (aux < num) {
						aux = num;
					}
				} while (contador < 6);
				
				datoValido = false;
				
				System.out.println("El numero maximo es: " + aux);

			} catch (Exception e) {
				System.out.println("Debes introducir un numero.");
			}
		} while(!datoValido);
		

	}

}
