package ExamenFicheros.ejercicio02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ApartadoA {

	public static void main(String[] args) {
		try {

			// Inicializamos objeto BufferedWriter para escribir en fichero
			// totaldirectivos.txt
			BufferedWriter bw = new BufferedWriter(new FileWriter("archivos/totaldirectivos.txt"));

			// Inicializamos objeto BufferedReader para leer el fichero directivo1.txt
			BufferedReader br1 = new BufferedReader(new FileReader("archivos/directivo1.txt"));

			// Inicializamos objeto BufferedReader para leer el fichero directivo2.txt
			BufferedReader br2 = new BufferedReader(new FileReader("archivos/directivo2.txt"));

			String linea1 = br1.readLine();
			String linea2 = br2.readLine(); // Me salto la primera línea de cada uno para que no se duplique

			bw.write(linea1 + "\n"); // Escribo solo una vez la línea

			// Este while se utiliza en el caso de que los ficheros tengan diferentes
			// tamaños, así se escribiría bien de todas maneras, ya que controlamos las
			// líneas nulas
			while (linea1 != null || linea2 != null) {
				linea1 = br1.readLine();
				linea2 = br2.readLine();

				if (linea1 != null) {
					bw.write(linea1 + "\n"); // Escribo línea de fichero 1
				}

				if (linea2 != null) {
					bw.write(linea2 + "\n"); // Escribo línea de fichero 2
				}
			}

			bw.close();
			br1.close();
			br2.close(); // Cerramos objetos de escritura y lectura

			
			System.out.println("Abre el archivo 'archivos/totaldirectivos.txt' para comprobar resultado");
			// Controlamos las excepciones que pueden aparecer en la escritura/lectura del
			// fichero
		} catch (FileNotFoundException fe) {
			System.out.println("Fichero no encontrado");

		} catch (IOException ioe) {
			System.out.println("Fallo lectura/escritura fichero");
		}
	}

}
