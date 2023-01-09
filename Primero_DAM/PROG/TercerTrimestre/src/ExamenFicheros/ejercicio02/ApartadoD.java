package ExamenFicheros.ejercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ApartadoD {

	public static void main(String[] args) {
		try {
			// Inicializamos objeto BufferedReader para leer el fichero totaldirectivos.txt
			BufferedReader br = new BufferedReader(new FileReader("archivos/totaldirectivos.txt"));

			br.readLine(); // Me salto la línea del nombre de los campos para no tener error en la recogida
							// de sueldos como tipo Integer

			System.out.println("NOMBRE,RANGO,SUELDO");

			while (br.ready()) {
				// Inicializamos objeto StringTokenizer para separar las líneas
				StringTokenizer empleado = new StringTokenizer(br.readLine(), ",");

				String nombre = empleado.nextToken();
				String rango = empleado.nextToken();
				int sueldo = Integer.parseInt(empleado.nextToken());

				if (sueldo > 2000) {
					System.out.println(nombre + "," + rango + "," + sueldo);
				}
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
