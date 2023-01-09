package Tema9.ArrayList.Relacion2;

import java.util.ArrayList;
import java.util.Collections;



public class Ejercicio03 {

	public static void main(String[] args) {

		ArrayList<Double> lista1 = new ArrayList<Double>();
		// Crearemos un numero random entre 5 y 10, será la cantidad de elementos de la lista.
		int rango = (int)(Math.random()* (10 -5 +1) +5);
		
		for(int i = 0; i < rango; i++) {
			double valor = (Math.random()* (90-45 +1) +45);
			lista1.add(redondear(valor, 1));
		}
		
		System.out.println("Elementos de la lista: " + lista1);
		double promedio = 0.0;
		
		for (int i = 0; i < lista1.size(); i++) {
			promedio = lista1.get(i) + promedio;
		}
		
		System.out.println("Promedio: " + redondear(promedio / lista1.size(), 2));
		
		Collections.sort(lista1);
		
		System.out.println("Numero mayor: " + lista1.get(lista1.size()-1));
		
		double diferencia = lista1.get(lista1.size() -2)- lista1.get(1);
		System.out.println(redondear(diferencia, 1));
		
	}
	public static double redondear(double numero, int decimales) {
		return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
				
	}

}
