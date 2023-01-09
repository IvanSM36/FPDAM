package Tema11BaseDatos.Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prueba04 {

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
			//Actualiza el peso y la estatura de los animales, añadiendo 2
			String sql = "UPDATE circoivan.animales  SET peso = peso + 2, estatura = estatura + 2";
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
