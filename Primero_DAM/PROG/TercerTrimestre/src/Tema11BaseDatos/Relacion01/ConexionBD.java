package Tema11BaseDatos.Relacion01;

import Tema11BaseDatos.Relacion01.SentenciasMetodos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConexionBD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection con;
		int paisID ;
		String nombrePais;
		int duracionMin;
		int duracionMax;
		
		try {
			String url = "jdbc:mysql://localhost:3306/sakila";
			String user = "root";
			String pass = "admin";
			con = DriverManager.getConnection(url, user, pass);
			Statement sentencia = con.createStatement();

			// Ejercicio 01
			SentenciasMetodos.nombreScarlett(con);
			
			System.out.println();
			System.out.println();
			
			//Ejercicio02
			SentenciasMetodos.apellidoJohansson(con);
			
			System.out.println();
			System.out.println();
			
			//Ejercicio03
			SentenciasMetodos.cotengaOnombre(con);
			
			System.out.println();
			System.out.println();
			
			//Ejercicio04
			SentenciasMetodos.cotenOnombreAapellido(con);
			
			System.out.println();
			System.out.println();
			
			//Ejercicio05		
			SentenciasMetodos.cotenDosOnombreAapellido(con);
			
			System.out.println();
			System.out.println();
			
			//Ejercicio06
		/*	System.out.print("Introduzca una ID para buscar el pais: ");
			paisID = scan.nextInt();
			SentenciasMetodos.paisID(con, paisID);*/
			
			System.out.println();
			System.out.println();
			
			//Ejercicio07
		/*	System.out.print("Introduzca el nombre del pais para mostrar las ciudades: ");
			nombrePais = scan.next();
			SentenciasMetodos.ciudadxPais(con, nombrePais);*/
			
			System.out.println();
			System.out.println();
			
			//Ejercicio08
		/*	System.out.print("Introduzca duracion minima de la pelicula: ");			
			duracionMin = scan.nextInt();
			System.out.print("Introduzca duracion maxima de la pelicula: ");			
			duracionMax = scan.nextInt();
			System.out.println("Las peliculas con duracion entre " + duracionMin + " y " + duracionMax + " son:");
			SentenciasMetodos.duracionPeliculas(con, duracionMin, duracionMax);*/
			
			System.out.println();
			System.out.println();
			
			//Ejercicio09
			//SentenciasMetodos.insertarPais(con, "Andalucia");
			
			System.out.println();
			System.out.println();
			
			//Ejercicio10
			//SentenciasMetodos.actualizarApellJohan(con);
			
			System.out.println();
			System.out.println();
			
			//Ejercicio11
		//	SentenciasMetodos.borrarCiudad(con, "Andalucia");	
			
			System.out.println();
			System.out.println();
			
			//Ejercicio12
			
			//SentenciasMetodos.mostrarCiudades(con);
			
			con.close();
		} catch (SQLException ex) {
			con = null;
			ex.printStackTrace();
			System.out.println("SQLExcepion: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError " + ex.getErrorCode());

		}
		
	}

}
