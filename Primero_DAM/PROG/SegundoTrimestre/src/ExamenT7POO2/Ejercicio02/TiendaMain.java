package ExamenT7POO2.Ejercicio02;

import java.util.Scanner;

public class TiendaMain {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		int cantidad = 0;	
		
		
		int opcion = 0; // para salir del bucle
		do {
			System.out.println();
			System.out.println("Tienda de Informatica.");
			System.out.println("┌────────────────────────┐");
			System.out.println("│  1 Venta ordenadores.  │");
			System.out.println("│  2 Venta tablets.      │");
			System.out.println("│  0 Salir.              │");	
			System.out.println("└────────────────────────┘");
			System.out.println();
			
			System.out.print("Introduzca una opcion: ");
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("¿Cuantos ordenadores vas a comprar? max 4");
				cantidad = scan.nextInt();
				
				break;
			case 2:		
				System.out.println("¿Cuantas tablets vas a comprar? max 2");
				cantidad = scan.nextInt();
				break;
			
			default:
				if (opcion == 0) {
					System.out.println("Fin del programa");
				}else {
					System.out.println("Error, introduce una opcion entre el 0-7");
				}
				break;
			}
		} while (opcion != 0);
	}
		
}