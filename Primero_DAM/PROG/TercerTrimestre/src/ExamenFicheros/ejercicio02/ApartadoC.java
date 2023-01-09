package ExamenFicheros.ejercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ApartadoC {

	public static void main(String[] args) {
		try {
			// Inicializamos objeto BufferedReader para leer el fichero totaldirectivos.txt
			BufferedReader br = new BufferedReader(new FileReader("archivos/totaldirectivos.txt"));

			while (br.ready()) {
				// Inicializamos objeto StringTokenizer para separar las líneas
				StringTokenizer empleado = new StringTokenizer(br.readLine(), ",");

				String nombre = empleado.nextToken();
				empleado.nextToken(); // Me salto el token de RANGO
				String sueldo = empleado.nextToken(); // Utilizo sueldo como String ya que no realizamos operaciones con
														// él, y así puedo mostrar la primera línea que no es un número
														// entero
				System.out.println(nombre + "," + sueldo);
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
