package Tema10Ficheros.Relacion2Tokens;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio03 {

	public static void main(String[] args) {

		String[] resultado = null;
		String empleado = "csv/catalogo.csv";
		String edad = null;
		String directivo = null;
		String salario = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(empleado));
			String linea = null;

			while (br.ready()) {
				linea = br.readLine();
				resultado = linea.split(";");

				if (resultado[2].equals("INFORMATICA")) {
					if(resultado[3].equals("DIRECTIVO")) {
						directivo = resultado[0];
						salario = resultado[4];
						System.out.println("El sueldo de " + resultado[0] + " es: " + resultado[4]);
					}
				}
			}
			br.close();
		} catch (FileNotFoundException fne) {
			// TODO Auto-generated catch block
			fne.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
	}

}
