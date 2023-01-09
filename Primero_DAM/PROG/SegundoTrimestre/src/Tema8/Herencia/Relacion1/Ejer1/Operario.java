/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer1;

/**
 * @author IvanSM
 *
 */
public class Operario extends Empleado {

	/**
	 * Atributos
	 */
	
	///// Constructores /////
	public Operario() {

	}
	
	public Operario(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
	///// Getters and Setters ///// 



	///// Metodos /////
	@Override
	public String toString() {
		return "Empleado " + super.getNombre() + " -> Operario";

	}
	
	
}
