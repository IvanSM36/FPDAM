package Tema10Ficheros.Relacion2Tokens;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ejercicio01 {

	public static void main(String[] args) {
		String[] resultado;
		String empleado = "csv/Empleados.csv";
		String edad = null;
		String trabajo = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(empleado));
			String linea = null;

			while (br.ready()) {
				linea = br.readLine();
				resultado = linea.split(";");

				if (resultado[1].equals("Alex Johnson")) {

					edad = resultado[2];
					trabajo = resultado[3];
				}
			}
			System.out.println("La edad de Alex Johnson es: " + edad + " \n Y su trabajo es: " + trabajo);

		} catch (FileNotFoundException fne) {
			// TODO Auto-generated catch block
			fne.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}

	}

}
