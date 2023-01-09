/**
 * 
 */
package Tema8.Herencia.Prueba;

/**
 * @author IvanSM
 *
 */
public class Coche extends Vehiculo {

	/**
	 * Atributo
	 */
		
	public Coche() {

	}

	
	public Coche(int km, int mat) {
		super(km, mat);
		// TODO Auto-generated constructor stub
	}


	///// Metodos /////
	public void mostrarDatos() {
		 System.out.println("La matricula del coche es: " + super.matricula);
	}

	public void arrancar1() {
		System.out.println("Vehiculo arrancado.");	
	}
	
	private void acelerar() {
		System.out.println("Está acelerando");
	}
}
