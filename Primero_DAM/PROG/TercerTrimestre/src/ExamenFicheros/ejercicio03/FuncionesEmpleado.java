package ExamenFicheros.ejercicio03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 
 * @author alejm
 *
 */

public class FuncionesEmpleado {

	// Atributos
	private ArrayList<Empleado> listaEmpleados;

	// Constructor
	public FuncionesEmpleado() {
		this.listaEmpleados = new ArrayList<>();
	}

	// Métodos
	/**
	 * Método que leera el contenido del fichero y devolverá la lista de empleados
	 * 
	 * @param
	 * @return ArrayList
	 */
	public ArrayList<Empleado> leerFichero() throws FileNotFoundException, IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader("archivos/ejercicio03.txt"));

			while (br.ready()) {
				// Inicializamos objeto StringTokenizer para separar las líneas
				StringTokenizer empleado = new StringTokenizer(br.readLine(), ";");

				// Cada token será un atributo de empleado
				String DNI = empleado.nextToken();
				String cargo = empleado.nextToken();
				int sueldo = Integer.parseInt(empleado.nextToken());
				int productividad = Integer.parseInt(empleado.nextToken());

				// Añado en la lista empleado un nuevo empleado con los atributos obtenidos
				// anteriormente
				this.listaEmpleados.add(new Empleado(DNI, cargo, sueldo, productividad));
			}

			br.close();

			return this.listaEmpleados;

			// Si ocurre un error lo controlo en la función y vuelvo a lanzarlo para
			// controlarlo en el main
		} catch (FileNotFoundException fe) {
			System.out.println("Archivo no encontrado");
			throw fe;

		} catch (IOException ioe) {
			System.out.println("Fallo lectura/escritura archivo");
			throw ioe;
		}
	}

	/**
	 * Método que recorre el arrayList generado en el método leerFichero para crear
	 * un fichero empleado.txt con los datos de los empleados con un formato
	 * específico
	 * 
	 * @param
	 * @return
	 */
	public void escribirFichero() {
		try {

			// Inicializamos objeto BufferedWriter para escribir en fichero persona.txt
			BufferedWriter bw = new BufferedWriter(new FileWriter("archivos/empleados.txt"));

			// Recorremos el arrayList empleados e introduzco en empleados.txt la info con
			// el formato solicitado
			for (int i = 0; i < this.listaEmpleados.size(); i++) {
				Empleado e = this.listaEmpleados.get(i);

				// Escribo en empleados.txt la líneas con los formatos indicados
				bw.write("El empleado cuyo DNI es: " + e.getDNI());
				bw.write(" tiene un sueldo de " + (e.getSalario() + e.getProductividad()) + " €\n");
			}

			bw.close(); // Cerramos objeto de escritura

			// Controlamos las excepciones
		} catch (FileNotFoundException fe) {
			System.out.println("Fichero no encontrado");

		} catch (IOException ioe) {
			System.out.println("Fallo lectura/escritura fichero");
		}
	}
}
