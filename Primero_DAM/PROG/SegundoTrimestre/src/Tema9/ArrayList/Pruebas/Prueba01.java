package Tema9.ArrayList.Pruebas;
import java.util.ArrayList;
import java.util.Iterator;

public class Prueba01 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		
		System.out.println("Nº de elementos: " + a.size());
		
		a.add("Azul");
		a.add("Rojo");
		a.add("Verde");
		
		System.out.println("Nº de elementos " + a.size());
		
		a.add("Negro");
		
		System.out.println("Nº de elementos " + a.size());

		System.out.println("El elemento que hay en la posicion 0 es: " + a.get(0));
		System.out.println("El elemento que hay en la posicion 3 es: " + a.get(3));
		System.out.println();
		
		System.out.println("Contenido del ArrayList con for");
		System.out.println("------------------------");
		for(int i = 0; i < a.size(); i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("Contenido del ArrayList con for each");
		System.out.println("-------------------------------------");
		for(String color: a) {
			System.out.println(color);
		}
		
		System.out.println();
		System.out.println("Contenido del ArrayList con iterador");
		System.out.println("-------------------------------------");
		Iterator<String> it = a.iterator();
		while(it.hasNext()) {
			String nombre = it.next();
			System.out.println(nombre);
		}
		System.out.println();
		
		System.out.println("Contenido del vector");
		System.out.println(a);
		
		a.set(2, "Turquesa");
		System.out.println("Contenido del vector despues de machacar la posicion 2: ");		
		System.out.println(a);		
		System.out.println();
		
		System.out.println();
		System.out.println("Contenido del ArrayList con for each");
		System.out.println("-------------------------------------");
		a.add(3, "Morado");
		a.set(4, "Celeste");
		for(String color: a) {
			System.out.println(color);
		}
		
		//Borrar el contenido que contengan a
		a.removeIf(palabra -> palabra.contains("a"));
		System.out.println("Contenido del vector despues de borrar las palabras que contiene la letra a");
		System.out.println(a);
		
	}

}
