package Tema10Ficheros.PruebaCaracteres;

import java.io.File;

public class Prueba08 {

	public static void main(String[] args) {

		File fichero = new File("C:\\Users\\IvanSM\\Desktop\\IvanSM");
		File[] listado = fichero.listFiles();
		String fila;
		
		for(File f: listado) {			
			System.out.println("Nombre: " + f.getName() + " \tTamaño: " + f.length() / 1024.0 + "KB" );
		}
	}

}
