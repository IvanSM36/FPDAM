package ExamenFicheros.ejercicio03;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		FuncionesEmpleado empleados = new FuncionesEmpleado();

		// Controlo las excepciones que yo mismo lanzo en la función leerFichero
		try {
			empleados.leerFichero();

		} catch (FileNotFoundException fe) {
			System.out.println(fe.getMessage());

		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

		empleados.escribirFichero();
		System.out.println("Abre el archivo 'archivos/empleados.txt' para comprobar resultado");
	}

}
