package Tema11BaseDatos.Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Prueba08 {

	public static void main(String[] args) {

		System.out.println();
		Connection connection;

		String nombre, atraccion;
		try {
			String url = "jdbc:mysql://localhost:3306/circo";
			String user = "root";
			String pass = "admin";
			connection = DriverManager.getConnection(url, user, pass);

			// Necesitamos un statement para ejecutar una sentencia
			Statement stmt = connection.createStatement();

			// Para la ejecucion de sentencias que devuelven algo, necesitamos el elemento resultado
			String sql = "SELECT * FROM circo.animales";
			/*while (result.next()) {
				nombre = result.getString("nombre");
				atraccion = result.getString("nombre_atraccion");
				System.out.println("Nombre: " + nombre + "\tAtraccion: " + atraccion);
			}*/
			
			stmt.executeUpdate(sql);
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
