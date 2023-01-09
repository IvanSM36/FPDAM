/**
 * 
 */
package Tema7POO.Relacion1;

/**
 * @author IvanSM
 *
 */
public class Contactos {

	/**
	 * @param args
	 */
	private String nombre;
	private int telefono;

	// Constructores

	public Contactos(String n, int t) {
		this.nombre = n;
		this.telefono = t;
	}
	public Contactos(String n) {
		this.nombre = n;
		this.telefono = 0;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	// Metodos
	public boolean igualaNombre(Contactos c) {
		if (this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())) {
			return true;
		}else {
			return false;
		}
	}
}
