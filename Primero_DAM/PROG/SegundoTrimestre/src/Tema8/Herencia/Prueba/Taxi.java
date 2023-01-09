/**
 * 
 */
package Tema8.Herencia.Prueba;

/**
 * @author IvanSM
 *
 */
public class Taxi extends Vehiculo {

	/**
	 * Atributos
	 */
	
	private String licencia = "222222";
	
	public Taxi() {
		// TODO Auto-generated constructor stub
	}
	

	///// Metodos /////
	
	public Taxi(int km, int mat, String numLicencia) {
		super(km, mat);
		this.licencia = numLicencia;
		// TODO Auto-generated constructor stub
	}


	protected final void imprimirDatos() {
		int matricula = super.matricula;	
		System.out.println("Taxi: " + matricula + "\nKM: " + super.getKilometro() +"\nLicencia: " + this.licencia);
	}
}
