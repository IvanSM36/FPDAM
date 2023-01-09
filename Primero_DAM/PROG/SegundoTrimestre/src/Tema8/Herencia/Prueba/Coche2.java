/**
 * 
 */
package Tema8.Herencia.Prueba;

/**
 * @author IvanSM
 *
 */
public class Coche2 extends Vehiculo2 {

	/**
	 * Atributos
	 */
	
	private int numPuertas;
	
	///// Constructores /////
	public Coche2() {
		// TODO Auto-generated constructor stub
	}
	public Coche2 (int numRuedas, int potencia, String matricula, int numPuertas) {
		super(numRuedas, potencia, matricula);
		this.numPuertas = numPuertas;
	}
	
	/////Getters and Setters /////

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	///// Metodos /////
	
	public void marca () {
		System.out.println("Estas en la clase Coche2");
	}
		
	
	public void informacion2() {
		System.out.println("Coche2 \nNumeros de puertas = " + numPuertas); 
	}
	
	

}
