/**
 * 
 */
package Tema8.Herencia.Prueba;

/**
 * @author IvanSM
 *
 */
public class Vehiculo {

	/**
	 * Atributos
	 */
	
	private int kilometro;
	protected int matricula;
	
	///// Constructor /////
	public Vehiculo() {

	}
	
	public Vehiculo(int km, int mat) {
		this.kilometro = km;
		this.matricula = mat;
	}
	
	///// Getters and Setters /////
	public int getKilometro() {
		return kilometro;
	}

	public void setKilometro(int kilometro) {
		this.kilometro = kilometro;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	///// Metodos /////
	final protected void arrancar() {
		System.out.println("Vehiculo arrancado.");	
	}
	
	
}
