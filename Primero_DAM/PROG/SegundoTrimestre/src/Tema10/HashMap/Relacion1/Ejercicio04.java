package Tema10.HashMap.Relacion1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int random = 0;
		HashMap<String, String> miniDiccionario = new HashMap<String, String>();

		miniDiccionario.put("Perro", "Dog");
		miniDiccionario.put("Gato", "Cat");
		miniDiccionario.put("Pajaro", "Bird");
		miniDiccionario.put("Caballo", "Horse");
		miniDiccionario.put("Vaca", "Cow");
		miniDiccionario.put("Toro", "Bull");
		miniDiccionario.put("Pollo", "Chicken");
		miniDiccionario.put("Gallina", "Hen");
		miniDiccionario.put("Raton", "Mouse");
		miniDiccionario.put("Serpiente", "Snake");
		miniDiccionario.put("Aguila", "Eagle");
		miniDiccionario.put("Cuervo", "Raven");

		// Muestro 5 palabras del diccionario
		for (int i = 0; i < 5; i++) {
			random = (int)(Math.random()*12);
			System.out.println(miniDiccionario.get(random));
		}
		
		System.out.println();
		
		System.out.println("Diccionario bilingue de animales");		
		System.out.print("Introduzca un animal en español: ");
		String animal = scan.next();

	}

}
