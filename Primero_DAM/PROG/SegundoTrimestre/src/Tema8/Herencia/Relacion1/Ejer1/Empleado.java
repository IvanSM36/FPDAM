/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer1;

/**
 * @author IvanSM
 *
 */
public class Empleado {

	/**
	 * Atributos
	 */
	
	private String nombre;
	
	///// Constructores /////
	//Constructor por defecto
	public Empleado() {
		
	}
	
	// Un constructor con parámetros que inicializa el nombre con el String que recibe.
	public Empleado (String n) {
		this.nombre = n;
	}

	///// Getters and Setters /////
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	///// Metodos /////
	@Override
	public String toString() {
		return "Empleado nombre = " + nombre ;
	}

}
