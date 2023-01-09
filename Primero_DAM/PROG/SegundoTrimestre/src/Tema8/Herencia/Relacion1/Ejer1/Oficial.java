/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer1;

/**
 * @author IvanSM
 *
 */
public class Oficial extends Operario{

	/**
	 * Constructores 
	 */
	public Oficial() {
		// TODO Auto-generated constructor stub
	}
	
	public Oficial(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	///// Metodos /////
	@Override
	public String toString() {
		return "Empleado " + super.getNombre() + " -> Operario -> Oficial";
	}

}
