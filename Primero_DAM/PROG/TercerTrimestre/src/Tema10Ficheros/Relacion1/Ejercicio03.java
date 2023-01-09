package Tema10Ficheros.Relacion1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int sumaTotal = 0;
		String ficheroLeer = "src/Tema11Ficheros/Ficheros/Ejercicio03.txt";
		int leer = Integer.parseInt("0");

		try {
			BufferedReader br = new BufferedReader(new FileReader(ficheroLeer));

			String linea;
			
			// Mientras el buffer esta preparado
			while (br.ready()) {
				linea = br.readLine(); // leo una linea del buffer
				System.out.println(linea); // Muestro la linea leida
				leer = Integer.parseInt(linea); // Convierto la linea a int
				sumaTotal += leer; //Hago la suma total
				
			}
			System.out.println("La suma total es: " + sumaTotal);

			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}

		
	}

}
