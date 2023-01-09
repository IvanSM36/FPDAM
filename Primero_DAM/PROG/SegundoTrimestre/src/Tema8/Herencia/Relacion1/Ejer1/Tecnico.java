/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer1;

/**
 * @author IvanSM
 *
 */
public class Tecnico extends Operario {

	/**
	 * Constructores 
	 */
	public Tecnico() {
		// TODO Auto-generated constructor stub
	}
	

	public Tecnico(String n) {
		super(n);
	}


	///// Metodos /////
	@Override
	public String toString() {
		return "Empleado " + super.getNombre() + " -> Operario -> Tecnico";
	}

	
}
