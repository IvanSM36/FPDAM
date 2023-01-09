package ExamenFicheros.ejercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ApartadoB {

	public static void main(String[] args) {
		try {
			// Inicializamos objeto BufferedReader para leer el fichero totaldirectivos.txt
			BufferedReader br = new BufferedReader(new FileReader("archivos/totaldirectivos.txt"));
			
			//Mostramos las 5 primeras líneas
			for (int i = 0; i < 5; i++) {
				System.out.println(br.readLine());
			}

			br.close(); // Cerramos objetos de lectura

			// Controlamos las excepciones que pueden aparecer en la escritura/lectura del
			// fichero
		} catch (FileNotFoundException fe) {
			System.out.println("Fichero no encontrado");

		} catch (IOException ioe) {
			System.out.println("Fallo lectura/escritura fichero");
		}

	}

}
