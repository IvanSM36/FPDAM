package Tema11BaseDatos.Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Prueba07 {

	public static void main(String[] args) {
		Connection con = null;
		Statement sentencia;
		String sql;
		String url = "jdbc:mysql://localhost:3306/circoivan";

		String nombre, atraccion;

		try {
			con = DriverManager.getConnection(url, "root", "carlos");
			// Necesitamos un statement para ejecutar una sentencia
			sentencia = con.createStatement();
			con.setAutoCommit(false); // Desactivo el commit para cada sentencia

			// Para la ejecucion de sentencias que devuelven algo, necesitamos el elemento
			// resultado
			// Inserta una pista y aforo por teclado.
			sql = "DELETE FROM circoivan.artistas WHERE artistas.nombre = 'Julio' AND artistas.apellidos = 'Fernandez Ramirez'";
			sentencia.executeUpdate(sql);
			con.commit(); // Al finalizar sentencias hago commit
			con.setAutoCommit(true);// Y vuelvo a activar autocommit para resto de aplicación
		} catch (SQLException ex) {
			try {
				con.rollback(); // Si algo falla hago rollback para dejarlo como antes
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			ex.printStackTrace();
			System.out.println("SQLExcepion: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError " + ex.getErrorCode());
		}
	}

}
