/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer4;

/**
 * @author IvanSM
 *
 */
public class Animal {

	/**
	 * Atributo
	 */
	
	protected String nombre;
	protected String alimentacion;
	protected int edad;

	///// Constructores /////	
	public Animal(String nombre, String alimentacion, int edad) {
		this.nombre = nombre;
		this.alimentacion = alimentacion;
		this.edad = edad;	
	}
	
	///// Getters and Setters /////
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", alimentacion=" + alimentacion + ", edad=" + edad + "]";
	}
	
	///// Metodos /////

	

}
