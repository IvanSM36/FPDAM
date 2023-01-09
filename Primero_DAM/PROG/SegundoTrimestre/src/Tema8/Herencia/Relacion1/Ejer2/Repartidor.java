/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer2;

/**
 * @author IvanSM
 *
 */
public class Repartidor extends Empleado{

	/**
	 * Atributos
	 */
	private String zona;
	
	///// Constructores /////
	public Repartidor() {

	}

	public Repartidor(String nombre, String ape1, int edad, int salario, String zona) {
		super(nombre, ape1, edad, salario);
		this.zona = zona;
	}

	/////Getters and Setters /////
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	
}
