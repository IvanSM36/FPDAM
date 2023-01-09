package Tema09.HashMap.Relacion1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
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
		
		System.out.println("Diccionario bilingue de animales");
		System.out.print("Introduzca un animal en español: ");
		String animal = scan.next();
		
		if(miniDiccionario.containsKey(animal)) {
			System.out.println(animal + " en ingles es: " + miniDiccionario.get(animal));
		}
		scan.close();
	}

}
