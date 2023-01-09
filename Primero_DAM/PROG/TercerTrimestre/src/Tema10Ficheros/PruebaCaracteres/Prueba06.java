package Tema10Ficheros.PruebaCaracteres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba06 {

	public static void main(String[] args) {
		
		String ficheroLeer = "src/Tema11Ficheros/Ficheros/Deportistas.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(ficheroLeer));
			String linea = null;

			// Mientras el buffer esta preparado
			while (br.ready()) {
				linea = br.readLine(); //leo una linea del buffer
			}
			
			// indico que separe por tokens.
			String[] resultado = linea.split(";");	

			// Recorro el array para mostrarlo
			for(int i = 0; i < resultado.length; i++) {
				System.out.println(resultado[i]);
			}
			
			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}

	}

}
