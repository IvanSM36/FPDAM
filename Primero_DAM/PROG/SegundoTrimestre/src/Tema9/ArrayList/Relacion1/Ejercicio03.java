package Tema9.ArrayList.Relacion1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tamanio = 10;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//Rellenamos el arrayList con numeros pedido por teclado.
		for(int i = 0; i < tamanio; i++) {
			System.out.print("Introduzca un numero: ");
			int num = scan.nextInt();
			numeros.add(num);
		}
	
		//Ordenamos el ArrayList
		Collections.sort(numeros);
			
		System.out.println();
		System.out.println("Contenido del ArrayList ordenado");
		System.out.println("-------------------------------------");
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()) {
		int num = it.next();
		System.out.println(num);
		}
		System.out.println();
	 
		
	}

}
