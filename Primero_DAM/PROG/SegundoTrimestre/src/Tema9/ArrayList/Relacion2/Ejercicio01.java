package Tema9.ArrayList.Relacion2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = leerValores();
		int suma = calcularSuma(numeros);
		int media = suma / numeros.size();
		mostrarResultados(numeros, suma, media);

	}
	
	// Metodos

	public static ArrayList<Integer> leerValores() {
		Scanner scan = new Scanner(System.in);

		// Variables
		int num = 0;

		// Declaro el ArrayList
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// Va introduciendo numeros al ArrayList
		for (int i = 0; num != -99; i++) {
			System.out.print("Introduzca un numero: ");
			num = scan.nextInt();
			numeros.add(num);
			if (num == -99) {
				numeros.remove(i); // borra el valor -99
			}
		}
		return numeros;
	}
	
	public static int calcularSuma(ArrayList<Integer> numeros) {
		int suma = 0;
		Iterator<Integer> it = numeros.iterator();
		while (it.hasNext()) {
			suma += it.next();		
		}	
		return suma;				
	}
	
	public static void mostrarResultados(ArrayList<Integer> numeros, int suma, int media) {
		int mayorQueMedia = 0;
		int contador = 0;
		for(int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i) > media) {
				contador ++;
			}
		}
		
		System.out.print("\nLa suma del contenido del ArrayList es: " + suma);
		System.out.print("\nLa media del contenido del ArrayList es: " + media);
		System.out.print("\nCantidad  de numeros superiores a la media dentro del ArrayList : " + contador);
		
	}
	

}
