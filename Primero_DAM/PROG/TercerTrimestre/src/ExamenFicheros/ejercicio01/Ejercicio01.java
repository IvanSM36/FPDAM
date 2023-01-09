package ExamenFicheros.ejercicio01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		try {

			// Inicializamos objeto BufferedWriter para escribir en fichero persona.txt
			BufferedWriter bw = new BufferedWriter(new FileWriter("archivos/personas.txt"));
			Scanner input = new Scanner(System.in);

			System.out.println("PERSONAS.TXT");
			System.out.println("============");

			// Vamos s introducir tres personas para ver un ejemplo de como sería
			for (int i = 0; i < 3; i++) {
				System.out.print("Introduzca el NOMBRE de la persona " + (i + 1) + ": ");
				bw.write(input.nextLine() + ";"); // Escribimos el nombre de la persona + ";" en el fichero

				System.out.print("Introduzca la EDAD de la persona " + (i + 1) + ": ");
				bw.write(input.nextInt() + ";"); // Escribimos la edad de la persona + ";"
				input.nextLine(); // Me salto una línea para que no se produzca el error al recoger variables int

				System.out.print("Introduzca la PROFESIÓN de la persona " + (i + 1) + ": ");
				bw.write(input.nextLine() + "\n"); // Escribumos la profesión de la persona + salto de línea

				System.out.println();
			}

			input.close(); // Cerramos objeto Scanner
			bw.close(); // Cerramos objeto de escritura

			System.out.println("\nLECTURA PERSONAS.TXT");
			System.out.println("====================");
			// Inicializamos objeto BufferedReader para leer el fichero persona.txt
			BufferedReader br = new BufferedReader(new FileReader("archivos/personas.txt"));

			// Mientras haya líneas en el fichero
			while (br.ready()) {
				String[] persona = br.readLine().split(";"); // Separamso la línea por ";"

				// Si la persona contiene todas las variantes de la letra "a"
				if (persona[0].toLowerCase().contains("a") || persona[0].toLowerCase().contains("á")) {
					System.out.print("La persona cuyo nombre es " + persona[0]);
					System.out.print(" y su edad es " + persona[1]);
					System.out.println(", está trabajando como " + persona[2]);
				}
			}

			br.close(); // Cerramos objeto de lectura

			// Controlamos las excepciones que pueden aparecer en la escritura/lectura del
			// fichero
		} catch (FileNotFoundException fe) {
			System.out.println("Fichero no encontrado");

		} catch (IOException ioe) {
			System.out.println("Fallo lectura/escritura fichero");
		}
	}

}
