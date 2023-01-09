package Tema11BaseDatos.Prueba;
import java.sql.*;
public class PruebaConexion {

	public static void main(String[] args) {

		Connection connection;
		
		String nombre, tipo;
		try {
			String url = "jdbc:mysql://localhost:3306/circo";
			String user = "root";
			String pass = "admin";
			connection = DriverManager.getConnection(url, user, pass);
			
			//Necesitamos un statement para ejecutar una sentencia
			Statement stmt = connection.createStatement();
			
			//Para la ejecucion de sentencias que devuelven algo, necesitamos el elemento resultado
			ResultSet result = stmt.executeQuery("SELECT * FROM circo.animales");
			
			while(result.next()) {
				nombre = result.getString("nombre");
				tipo = result.getString("tipo");
				
				System.out.println(nombre + " " + tipo);
			}
			
			result.close();
			connection.close();
		}catch (SQLException ex) {
			connection = null;
			ex.printStackTrace();
			System.out.println("SQLExcepion: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError " + ex.getErrorCode());
		}
	}

}
