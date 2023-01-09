package Tema10Ficheros.PruebaCaracteres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba03 {

	public static void main(String[] args) {
		String nombreFichero = "malaga.txt";

		try (BufferedReader bf = new BufferedReader(new FileReader(nombreFichero))) {
			String linea;

			// Mientras el buffer esta preparado
			while (bf.ready()) {
				linea = bf.readLine(); //leo una linea del buffer
				System.out.println(linea);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}

	}

}
