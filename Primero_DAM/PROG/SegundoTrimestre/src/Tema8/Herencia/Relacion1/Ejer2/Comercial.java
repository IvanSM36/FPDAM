/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer2;

/**
 * @author IvanSM
 *
 */
public class Comercial extends Empleado {

	/**
	 * Atributo
	 */
	private int comision;
	
	///// Constructores /////
	public Comercial() {
		
	}
	
	public Comercial(String nombre, String ape1, int edad, int salario, int comision) {	
		super(nombre, ape1, edad, salario);
		this.comision = comision;
	}

	///// Getters and Setters /////
	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}
	

}
