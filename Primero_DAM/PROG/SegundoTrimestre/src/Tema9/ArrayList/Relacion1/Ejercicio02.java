package Tema9.ArrayList.Relacion1;

import java.util.ArrayList;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variables
		int suma = 0;
		int media = 0;
		int maximo = 0;
		int minimo = 1000;
		int tamanio = (int) (Math.random() * 11 + 10); // Sera el tamanio que oscilara el arrayList

		// Declaro el arrayList
		ArrayList<Integer> numRandom = new ArrayList<Integer>();

		// Relleno el ArrayList
		for (int i = 0; i < tamanio; i++) {
			numRandom.add((int) (Math.random() * 101)); // seran numeros random del 0 - 100
		}

		// Mostramos el contenido del arrayList
		System.out.println("Contenido del ArrayList");
		System.out.println("-----------------------");
		System.out.println(numRandom);

		// Calculamos la suma total del ArrayList, la media y mostramos.
		for (int i = 0; i < tamanio; i++) {
			suma += numRandom.get(i);
			media = suma / tamanio;
		}
		System.out.println();
		System.out.println("La suma total del ArrayList es: " + suma);
		System.out.println("La media del ArrayList es: " + media);

		// Calculamos el maximo y el minimo
		for (int i = 0; i < tamanio; i++) {
			if(numRandom.get(i) > maximo) 
				maximo = numRandom.get(i);		
			if(minimo > numRandom.get(i))
				minimo = numRandom.get(i);
		}
		System.out.println();
		System.out.println("El numero maximo es: " + maximo);
		System.out.println("El numero minimo es: " + minimo);
	}

}
