/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer1;

/**
 * @author IvanSM
 *
 */
public class Directivo extends Empleado {

	/**
	 * Constructores 
	 */
	public Directivo() {
		// TODO Auto-generated constructor stub
	}	
	
	public Directivo(String n) {
		super(n);
	}



	@Override
	public String toString() {
		return "Empleado " + super.getNombre() + " -> Directivo";
	}
	
	

}
