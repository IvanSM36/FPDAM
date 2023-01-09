package Tema11BaseDatos.Relacion01Solucion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.Scanner;




public class Sentencias {

	
	

	/**
	 * metodo que muestra actores con nombre scarlett
	 * @param con
	 */
	static void nomScarlett(Connection con) {
		
		try {
		Statement s = con.createStatement();
		ResultSet r = s.executeQuery("SELECT * FROM actor WHERE ucase(first_name) = 'Scarlett'");
		
		while (r.next()) {
			int id = r.getInt(1);
			String nombre = r.getString(2);
			String apellidos = r.getString(3);
			
			System.out.println("Actor con ID = "+id+" se llama "+nombre+ " "+ apellidos);
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			try {
				con.close();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
	}
	
	
	
	
	/**
	 * metodo al que se le pasa por parametro el apellido y te da la info del actor
	 * @param con
	 */
	static void actorApellidos(Connection con) {
		Scanner s = new Scanner(System.in);
		String sql = "SELECT actor_id,first_name,last_name FROM actor WHERE last_name = ucase(?)";
		
		try {
		
		PreparedStatement sent = con.prepareStatement(sql);
		System.out.println("Digame el apellido a buscar y le enseñaré todos los actores que lo tienen.");
		System.out.println("Apellido a buscar = ");
		String apellido = s.nextLine();
		sent.setString(1, apellido);
		ResultSet r = sent.executeQuery();
		
		
		while (r.next()) {
			int id = r.getInt(1);
			String nombre = r.getString(2);
			String apellidos = r.getString(3);
			
			System.out.println("Actor con ID = "+id+" se llama "+nombre+ " "+ apellidos);
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			try {
				con.close();
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
	}

	
	
	/**
	 * actores con o en su nombre
	 * @param con
	 */
	static void actoresONombre(Connection con) {
		
		try {
		Statement s = con.createStatement();
		ResultSet r = s.executeQuery("SELECT actor_id,first_name,last_name FROM actor WHERE ucase(first_name) like '%o%'");
		System.out.println("Los actores con la letra o en su nombre son: ");
		while (r.next()) {
			int id = r.getInt(1);
			String nombre = r.getString(2);
			String apellidos = r.getString(3);
			
			System.out.println("Actor con ID = "+id+" se llama "+nombre+ " "+ apellidos);
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
	}
	
	
	
	
	/**
	 * actores con o en nombre y a en apellido
	 * @param con
	 */
	static void actor_O_A(Connection con) {
		
		try {
		Statement s = con.createStatement();
		ResultSet r = s.executeQuery("SELECT actor_id,first_name,last_name FROM actor WHERE ucase(first_name) like '%o%' AND ucase(last_name) like '%a%'");
		System.out.println("Los actores con dos letras o en su nombre y a en su apellido son: ");
		while (r.next()) {
			int id = r.getInt(1);
			String nombre = r.getString(2);
			String apellidos = r.getString(3);
			
			System.out.println("Actor con ID = "+id+" se llama "+nombre+ " "+ apellidos);
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
	}
	
	
	
	/**
	 * actores con  dos o en nombre y a en apellido
	 * @param con
	 */
	static void actor_2_O_A(Connection con) {
		
		try {
		Statement s = con.createStatement();
		ResultSet r = s.executeQuery("SELECT actor_id,first_name,last_name FROM actor WHERE ucase(first_name) like '%o%o%' AND ucase(last_name) like '%a%'");
		System.out.println("Los actores con dos letras o en su nombre y a en su apellido son: ");
		while (r.next()) {
			int id = r.getInt(1);
			String nombre = r.getString(2);
			String apellidos = r.getString(3);
			
			System.out.println("Actor con ID = "+id+" se llama "+nombre+ " "+ apellidos);
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
	}
	
	
	/**
	 * muestra el nombre de las ciudades del id de pais que se le pasa por parametro
	 * @param con
	 */
	static void ciudadXidPais(Connection con) {
		Scanner s = new Scanner(System.in);
		String sql = "SELECT city_id,city,country_id FROM city WHERE country_id = ?";
		
		try {
		
		PreparedStatement sent = con.prepareStatement(sql);
		System.out.println("Digame el ID del Pais y le mostraré las ciudades que lo forman.");
		int idPais = s.nextInt();
		sent.setInt(1, idPais);
		ResultSet r = sent.executeQuery();
		
		
		while (r.next()) {
			int idciudad = r.getInt(1);
			String nombre = r.getString(2);
			int idpais = r.getInt(3);
			
			System.out.println("ID ciudad = "+idciudad+" llamada "+nombre+ " con ID pais = "+ idpais);
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			try {
				con.close();
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
	}
	
	
	
	/**
	 * ciudades del pais spain pasado por parametro
	 * @param con
	 */
	static void ciudadesPais(Connection con) {
		Scanner s = new Scanner(System.in);
		String sql = "SELECT city_id,city,country_id FROM city WHERE country_id = (SELECT country_id FROM country WHERE ucase(country) = ?)";
		
		try {
		
		PreparedStatement sent = con.prepareStatement(sql);
		System.out.println("Digame el nombre del Pais y le mostraré las ciudades que lo forman.");
		String pais = s.nextLine();
		sent.setString(1, pais);
		ResultSet r = sent.executeQuery();
		
		
		while (r.next()) {
			int idciudad = r.getInt(1);
			String nombre = r.getString(2);
			int idpais = r.getInt(3);
			
			System.out.println("ID ciudad = "+idciudad+" llamada "+nombre+ " con ID pais = "+ idpais);
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			try {
				con.close();
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
	}
	
	
	
	/**
	 * peliculas con una duracion entre dos parametros pedidos
	 * @param con
	 */
	static void peliculasDuracionEntre(Connection con) {
		Scanner s = new Scanner(System.in);
		String sql = "SELECT film_id,title,length FROM film WHERE length between ? and ?";
		
		try {
		
		PreparedStatement sent = con.prepareStatement(sql);
		System.out.println("Le mostraré las peliculas con duración entre dos parametros.");
		System.out.println("Digame la duración minima de la pelicula.");
		int min = s.nextInt();
		System.out.println("Digame la duración máxima de la pelicula.");
		int max = s.nextInt();
		sent.setInt(1, min);
		sent.setInt(2, max);
		ResultSet r = sent.executeQuery();
		
		while (r.next()) {
			int id = r.getInt(1);
			String titulo = r.getString(2);
			int duracion = r.getInt(3);
			
			System.out.println("ID de Pelicula = "+id+" con titulo "+titulo+ " con duración = "+ duracion);
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			try {
				con.close();
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}	
	}
	
	
	
	/**
	 * inserta una ciudad en tabla
	 * @param con
	 */
	static void insertCiudad(Connection con) {
		
		Scanner s = new Scanner(System.in);
		String sql = "INSERT INTO country (country) VALUES (?)";
		
		
	try {
		
		con.setAutoCommit(false);
		PreparedStatement sent = con.prepareStatement(sql);
		System.out.println("Vamos a introducir un pais.\nDigame el nombre.");
		String pais = s.nextLine(); 
		sent.setString(1, pais);
		sent.executeUpdate();
		con.commit(); 
		con.setAutoCommit(true);
		System.out.println("Pais añadida correctamente.");
		
		
		
	}catch (SQLTimeoutException e) {
		System.out.println("TimeOutException = "+e.getMessage());
	}catch (SQLException e) {
		try {
			System.out.println(e.getMessage());
			con.rollback(); // vuelvo atras si hay fallos
		}catch(SQLException ex) {
			ex.printStackTrace();
		}	
	}finally {
		try {
			s.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}
	
	
	
	/**
	 * metodo que cambia el apellido johansson por johan
	 * @param con
	 */
	static void uppdateActor(Connection con) {
		
		String sql = "UPDATE actor set last_name = 'JOHAN' WHERE last_name = 'JOHANSSON'";
		
		
	try {
		
		Statement stmt = con.createStatement();
		con.setAutoCommit(false);
		stmt.executeUpdate(sql);
		con.commit(); 
		con.setAutoCommit(true);
		System.out.println("Apellido Johansson cambiado por Johan.");
		
		
		
	}catch (SQLTimeoutException e) {
		System.out.println("TimeOutException = "+e.getMessage());
	}catch (SQLException e) {
		try {
			System.out.println(e.getMessage());
			con.rollback(); // vuelvo atras si hay fallos
		}catch(SQLException ex) {
			ex.printStackTrace();
		}	
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}
	
	
	/**
	 * elimina una ciudad en tabla
	 * @param con
	 */
	static void deleteCiudad(Connection con) {
		
		Scanner s = new Scanner(System.in);
		String sql = "DELETE FROM country WHERE country = ucase(?)";
		
		
	try {
		
		con.setAutoCommit(false);
		PreparedStatement sent = con.prepareStatement(sql);
		System.out.println("Vamos a borrar un pais.\nDigame el nombre.");
		String pais = s.nextLine(); 
		sent.setString(1, pais);
		sent.executeUpdate();
		con.commit(); 
		con.setAutoCommit(true);
		System.out.println("Pais eliminada correctamente.");
			
		
	}catch (SQLTimeoutException e) {
		System.out.println("TimeOutException = "+e.getMessage());
	}catch (SQLException e) {
		try {
			System.out.println(e.getMessage());
			con.rollback(); 
		}catch(SQLException ex) {
			ex.printStackTrace();
		}	
	}finally {
		try {
			s.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
	
	/**
	 * metodo que recorre ciudades de españa de abajo -> arriba
	 * @param con
	 */
	static void ciudadReverso(Connection con) {
		
		String sql = "SELECT country, city FROM city, country WHERE country.country_id = city.country_id AND country = 'Spain'";
		Statement s = null;
		ResultSet r = null;
		
		try {
			
			s = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			r = s.executeQuery(sql);
			r.afterLast();
			
			while (r.previous()) {
				String pais = r.getString(1);
				String ciudad = r.getString(2);
				
				System.out.println("Pais = "+pais+"\nCiudad = "+ciudad+"\n");
			}
			
			
		}catch (SQLTimeoutException e) {
			System.out.println("TimeOutException = "+e.getMessage());
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			try {
				s.close();
				con.close();
				r.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		
	}
	
	
	/**
	 * 
	 */
	static void datosStaff(Connection con) {
		
		String pais,ciudad, dir1, dir2, nombre,apellido;
		String sql = "SELECT country, city, address, address2, first_name, last_name FROM city, country, address, staff WHERE country.country_id = city.country_id AND address.city_id = city.city_id AND staff.address_id = address.address_id";
		Statement s = null;
		ResultSet r = null;
		
		try {
			
			s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			r = s.executeQuery(sql);
			r.absolute(3);
			
			while (r.previous()) {
				pais = r.getString(1);
				ciudad = r.getString(2);
				dir1 = r.getString(3);
				dir2 = r.getString(4);
				nombre = r.getString(5);
				apellido = r.getString(6);
				
				System.out.println("Nombre: "+nombre+" "+apellido);
				System.out.println("Pais = "+pais+"\nCiudad = "+ciudad+"\nDireccion1 = "+dir1+"\nDireccion2 = "+dir2+"\n");
			}
			
			
		}catch (SQLTimeoutException e) {
			System.out.println("TimeOutException = "+e.getMessage());
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException : "+e.getMessage());
			System.out.println("SQLState : "+e.getSQLState());
			
		}finally {
			try {
				s.close();
				con.close();
				r.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
