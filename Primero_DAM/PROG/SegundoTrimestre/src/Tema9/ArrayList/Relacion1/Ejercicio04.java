package Tema9.ArrayList.Relacion1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variable
		int tamanio = 10;

		// Declaro el arrayList
		ArrayList<String> palabras = new ArrayList<String>();
		// Relleno el arrayList
		for (int i = 0; i < tamanio; i++) {
			System.out.print("Introduzca una palabra: ");
			String palabra = scan.next();
			palabras.add(palabra);
		}

		// Ordenamos el ArrayList
		Collections.sort(palabras);
		
		// Mostramos el contenido del ArrayList
		System.out.println();
		System.out.println("Contenido del ArrayList ordenado");
		System.out.println("-------------------------------------");
		Iterator<String> it = palabras.iterator();
		while(it.hasNext()) {
		String palabra = it.next();
		System.out.println(palabra);
		}
		System.out.println();

	}

}
