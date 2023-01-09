package Tema11BaseDatos.Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class Prueba06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduzca nombre de la atraccion : ");
		String nombreAtraccion = scan.next();
		//Recogemos la fecha del sistema para la fecha de inicio
		LocalDate fechaInicio = LocalDate.now();
		System.out.print("Introduzca la gananciade la atraccion: ");
		float ganancia = scan.nextFloat();
		
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
			// Inserta una pista y aforo por teclado.
			String sql = "INSERT INTO cicoivan.atracciones(nombre, fecha_inicio, ganancias)VALUES('" + nombreAtraccion + "'," + fechaInicio + "',"+ ganancia + ")";
			
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


//INSERT INTO circoivan.atracciones(nombre, fecha, ganancias ) VALUES ('Rey Leon', 4000 );
//INSERT INTO circoivan.atracciones_artistas(nombre_atraccion, fecha_inicio, ganancias) VALUES ('Rey Leon', 20-2-2022, 4000);
