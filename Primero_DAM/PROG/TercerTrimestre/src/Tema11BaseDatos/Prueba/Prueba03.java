package Tema11BaseDatos.Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prueba03 {

	public static void main(String[] args) {
		Connection connection;

		String nombre, atraccion;
		try {
			String url = "jdbc:mysql://localhost:3306/circoivan";
			String user = "root";
			String pass = "carlos";
			connection = DriverManager.getConnection(url, user, pass);

			// Necesitamos un statement para ejecutar una sentencia
			Statement stmt = connection.createStatement();

			// Para la ejecucion de sentencias que devuelven algo, necesitamos el elemento
			// resultado
			//Selecciona las atracciones que llevará a cabo el artista 33333333C
			ResultSet result = stmt.executeQuery("SELECT nombre, nombre_atraccion FROM circo.artistas, circo.atracciones_artistas \r\n"
					+ "where artistas.nif = atracciones_artistas.nif_artista\r\n"
					+ "and artistas.nif = \"33333333C\"");

			while (result.next()) {
				nombre = result.getString("nombre");
				atraccion = result.getString("nombre_atraccion");
				System.out.println("Nombre: " + nombre + "\tAtraccion: " + atraccion);
			}

			result.close();
			connection.close();
		} catch (SQLException ex) {
			connection = null;
			ex.printStackTrace();
			System.out.println("SQLExcepion: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError " + ex.getErrorCode());

		}
	}

}
