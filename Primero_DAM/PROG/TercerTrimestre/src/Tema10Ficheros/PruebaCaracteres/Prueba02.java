package Tema10Ficheros.PruebaCaracteres;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba02 {

	public static void main(String[] args) {

		String nombreFichero = "malaga.txt";
		
		try {
			FileReader fr = new FileReader(nombreFichero);
			int c = fr.read(); // leo un caracter como entero
			
			while (c != -1) {
				System.out.println("El caracter UNICODE: " + c);
				System.out.println("El caracter: " + (char)c);
				//Lee el siguiente caracter
				c= fr.read();
			}
			
			fr.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}
		
	}

}
