package Tema11BaseDatos.Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class prueba05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduzca nombre de la pista : " );
		String nombrePista = scan.next();
		System.out.println("Introduzca numero de aforo: ");
		int aforo = scan.nextInt();
		System.out.println();
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
			//Inserta una pista y aforo por teclado.
			String sql = "INSERT INTO pistas(nombre, aforo)VALUES('" + nombrePista + "'," + aforo + ")";
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
