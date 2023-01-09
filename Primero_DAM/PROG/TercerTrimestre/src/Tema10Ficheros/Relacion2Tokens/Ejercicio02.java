package Tema10Ficheros.Relacion2Tokens;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio02 {

	public static void main(String[] args) {

		String[] resultado = null;
		String empleado = "csv/empresaSamar.csv";
		String edad = null;
		String directivo = null;
		String salario = null;
		String horas = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(empleado));
			BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/40horas.txt", false));
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
				
				if (resultado[1].equals("40")) {
					directivo = resultado[0];
					horas = resultado[1];
					bw.write("Personas que han trabajado 40 horas a la semana: " + directivo + " es: " + horas + "\n");
				}
			}
			br.close();
			bw.close();

		} catch (FileNotFoundException fne) {
			// TODO Auto-generated catch block
			fne.printStackTrace();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
	}

}
