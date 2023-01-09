package Tema10Ficheros.Relacion1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Variable con la ruta y el nombre del archivo a guardar 
		String ficheroLeer = "src/Tema11Ficheros/Ficheros/NumerosPrimos.txt";

		try {
			BufferedReader br = new BufferedReader(new FileReader(ficheroLeer));

			String linea;

			// Mientras el buffer esta preparado
			while (br.ready()) {
				linea = br.readLine(); // leo una linea del buffer
				System.out.println(linea);
			}

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}

	}

}
