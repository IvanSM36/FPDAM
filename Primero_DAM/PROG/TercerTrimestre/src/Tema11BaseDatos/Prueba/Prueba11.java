package Tema11BaseDatos.Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Prueba11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double peso, peso2;

		Connection con;

		try {
			String url = "jdbc:mysql://localhost:3306/circo";
			String user = "root";
			String pass = "admin";
			con = DriverManager.getConnection(url, user, pass);

			System.out.println("Animales con peso mediano:");
			peso = scan.nextDouble();
			peso2 = scan.nextDouble();
			animalesXPeso(con, peso, peso2);
			System.out.println("Animales con peso mayor:");
			peso = scan.nextDouble();
			animalesXPesoMayor(con, peso);

			con.close();
		} catch (SQLException ex) {
			con = null;
			ex.printStackTrace();
			System.out.println("SQLExcepion: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError " + ex.getErrorCode());

		}
	}

	// Metodos
	public static void animalesXPesoMayor(Connection con, double peso) throws SQLException {
		// Formamos consulta
		String sql = "SELECT * FROM circoivan.animales WHERE  peso > ?";
		PreparedStatement sentencia = con.prepareStatement(sql);
		// Asignamos los parametros
		sentencia.setDouble(1, peso); // peso minimo
		ResultSet rs = sentencia.executeQuery();

		// Mostramos
		while (rs.next()) {
			System.out.println(rs.getString("nombre") + "\t" + rs.getString("peso"));
		}
	}

	// Metodos
	public static void animalesXPeso(Connection con, double peso, double peso2) throws SQLException {
		// Formamos consulta
		String sql = "SELECT * FROM circoivan.animales WHERE  peso > ? AND peso < ?";
		PreparedStatement sentencia = con.prepareStatement(sql);
		// Asignamos los parametros
		sentencia.setDouble(1, peso); // peso minimo
		sentencia.setDouble(2, peso2); // peso maximo
		ResultSet rs = sentencia.executeQuery();

		// Mostramos
		while (rs.next()) {
			System.out.println(rs.getString("nombre") + "\t" + rs.getString("peso"));
		}

	}

}
