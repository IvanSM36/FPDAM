package Tema11BaseDatos.Relacion01Solucion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexionBD_USO {

	public static void main(String[] args) throws SQLException {
		
		
		Connection con = null;
		String url = "jdbc:mysql://127.0.0.1:3306/sakila";
		String user = "root";
		String pass = "admin";
		
		try {
			
			con = DriverManager.getConnection(url, user, pass);
			
			// 1 Actores que tienen de primer nombre ‘Scarlett’
			
			//Sentencias.nomScarlett(con);
			
			// 2 Actores que tienen de apellido ‘Johansson’
			
			//Sentencias.actorApellidos(con);
			
			// 3 Actores que contengan una ‘O’ en su nombre
			
			//Sentencias.actoresONombre(con);
			
			// 4 Actores que contengan una ‘O’ en su nombre y en una ‘A’ en su apellido.
			
			//Sentencias.actor_O_A(con);
			
			// 5 Actores que contengan dos ‘O’ en su nombre y en una ‘A’ en su apellido
			
			//Sentencias.actor_2_O_A(con);
			
			// 6 Ciudades del country 61
			
			//Sentencias.ciudadXidPais(con);
			
			// 7 Ciudades del country ‘Spain’
			
			//Sentencias.ciudadesPais(con);
			
			// 8 Películas con una duración entre 80 y 100
			
			//Sentencias.peliculasDuracionEntre(con);
			
			// 9 Inserta una nueva ciudad en la tabla COUNTRY.
			
			//Sentencias.insertCiudad(con);
			
			// 10 Actualiza en la tabla ACTOR, los actores que tienen primer apellido
			//JOHANSSON por JOHAN.
			
			//Sentencias.uppdateActor(con);
			
			// 11 Elimina la ciudad creada en el apartado 9.
			
			//Sentencias.deleteCiudad(con);
			
			// 12 Mostrar las ciudades del country Spain (multitabla). Posiciónate al final de los
			//valores volcados y recórrelos de abajo a arriba.
			
			//Sentencias.ciudadReverso(con);
			
			//13 Mostrar el country, la ciudad y dirección de cada miembro del staff. Posiciónate
			//en la tercera fila y recorre los resultados a partir de ella.
			
			//Sentencias.datosStaff(con);
	
			
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			con.close();
			
		}

	}

}
