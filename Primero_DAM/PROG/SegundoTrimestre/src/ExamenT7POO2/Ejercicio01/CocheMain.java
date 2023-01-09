package ExamenT7POO2.Ejercicio01;

import java.util.Scanner;

public class CocheMain {

	/**
	 * Metodos @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Definimos el array de corredores
		GrupoCoche ventaCoches = new GrupoCoche(5);
		
		//Creamos los vehiculos	
		Coche c1 = new Coche("BMW", "M3", "5865DAM", 1500, 3500);
		Coche c2 = new Coche("Opel", "Astra", "5955DAM", 25000, 1500);
		Coche c3 = new Coche("Ford", "Focus", "6865DAM", 3000, 2500);
		Coche c4 = new Coche("Seat", "Leon", "4565DAM", 900, 4000);
				
		//Añadimos los coches	
		ventaCoches.altaCoche(c1);
		ventaCoches.altaCoche(c2);
		ventaCoches.altaCoche(c3);
		ventaCoches.altaCoche(c4);
		System.out.println();
		
		//Damos de baja algunos coches	
		ventaCoches.bajaCoche(c3);
		ventaCoches.bajaCoche(c2);
		System.out.println();
	
		//Añadimos el color del coche y del numero de puertas.
		System.out.print("Introduce el color del coche c1: ");
		String color = scan.next();
		c1.setColor(color);
		System.out.print("Introduzca el numero de puertas c1: ");
		int numPuertas = scan.nextInt();
		c1.setNumPuertas(numPuertas);
		System.out.println();
		
		//Mostramos los datos del coche c1
		System.out.println("Datos de coche c1");
		System.out.println("-----------------");
		System.out.println(c1);
		System.out.println();
		System.out.println("Datos de coche c2");
		System.out.println("-----------------");
		System.out.println(c2);
		System.out.println();
		
		//Probamos el metodo ofertas
		ventaCoches.ofertas(c1);
		System.out.println();
		ventaCoches.ofertas(c4);
		
	}

}
