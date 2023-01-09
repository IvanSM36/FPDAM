package Tema10Ficheros.PruebaCaracteres;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba04 {

	public static void main(String[] args) {

		String[] lineas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"	};
		
		// FORMA1 DE ESCRITURA
		String nombreFichero = "N4_Escribir2.txt";
		
		FileWriter fichero = null;
		
		try {
			fichero = new FileWriter(nombreFichero,false);
			//Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				fichero.write(linea + "\n");
			}
			fichero.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}
	}

}
