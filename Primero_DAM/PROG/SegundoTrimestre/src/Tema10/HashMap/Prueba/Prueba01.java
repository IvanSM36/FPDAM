package Tema10.HashMap.Prueba;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;

public class Prueba01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int codigoIntroducido;
		String valorIntroducido;

		HashMap<Integer, String> colores = new HashMap<Integer, String>();

		colores.put(1, "Azul");
		colores.put(2, "Rojo");
		colores.put(3, "Verde");
		colores.put(4, "Morado");
		colores.put(5, "Amarillo");
		colores.put(6, "Rosa");
		colores.put(7, "Negro");
		colores.put(8, "Blanco");
		colores.put(9, "Marron");
		colores.put(10, "Naranja");

		System.out.println("Muestro todos los colores");
		System.out.println("-------------------------");
		for (Map.Entry contenido : colores.entrySet()) {
			System.out.println(contenido);
		}

		System.out.println();

		System.out.println("Muestro todas las keys");
		System.out.println("----------------------");
		for (Map.Entry contenido : colores.entrySet()) {
			System.out.println(contenido.getKey() + "\t");
		}

		System.out.println();

		System.out.println("Muestro todos los valores");
		System.out.println("-------------------------");
		for (Map.Entry contenido : colores.entrySet()) {
			System.out.println(contenido.getValue());
		}

		System.out.println();

		System.out.println("Localizo valor de una clave");
		System.out.println("---------------------------");
		System.out.print("Introduzca un numero: ");
		codigoIntroducido = scan.nextInt();
		if (colores.containsKey(codigoIntroducido)) {
			System.out.println("El codigo " + codigoIntroducido + " corresponde a: " + colores.get(codigoIntroducido));
		} else {
			System.out.println("El codigo no existe.");
		}

		System.out.println();

		System.out.println("Sustituimos un valor");
		System.out.println("--------------------");
		System.out.print("Introduzca un numero: ");
		codigoIntroducido = scan.nextInt();
		System.out.print("Introduzca un color: ");
		valorIntroducido = scan.next();
		for (Map.Entry contenido : colores.entrySet()) {
			if (colores.containsKey(codigoIntroducido)) {
				colores.put(codigoIntroducido, valorIntroducido);
			}
		}

		System.out.println();

		System.out.println("Muestro todos los colores con iterador");
		System.out.println("-------------------------");
		for (Map.Entry contenido : colores.entrySet()) {
			System.out.println(contenido);
		}

		System.out.println();
		System.out.println("Contenido de con iterador");
		System.out.println("-------------------------");
		Iterator it = colores.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry contenido = (Map.Entry) it.next();
			System.out.println(contenido.getKey() + " = " + contenido.getValue());
		}

		System.out.println();

		for (int i = 1; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}

	}

}
