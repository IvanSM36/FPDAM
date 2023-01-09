package Tema10Ficheros.PruebaCaracteres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba2 {

	public static void main(String[] args) {

		String nombreFichero = "src/Tema11Ficheros/Ficheros/malaga.txt";
		
		try {
			String fichero = args[0];
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			String linea = "";
					
			while (linea != null) {
				System.out.println(linea);
				
				//Lee el siguiente caracter
				linea = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}
		
	}

}
