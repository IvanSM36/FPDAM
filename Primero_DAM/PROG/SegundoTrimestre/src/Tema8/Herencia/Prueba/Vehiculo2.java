/**
 * 
 */
package Tema8.Herencia.Prueba;

/**
 * @author IvanSM
 *
 */
public class Vehiculo2 {

	//Atributos
	private int numRuedas;
	private int potencia;
	private	String matricula;
	
	///// Constructor ///// 
	public Vehiculo2() {

	}

	public Vehiculo2(int numRuedas, int potencia, String matricula) {
		this.numRuedas = numRuedas;
		this.potencia = potencia;
		this.matricula = matricula;
	}
	
	///// Getters and Setters /////
	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	///// Metodos /////
	public void marca () {
		System.out.println("Estas en la clase Coche2");
	}
	
	
	final public void informacion() {
		System.out.println("Estoy en la clase vehiculo2");
		System.out.println("Vehiculo2 \nNumero de ruedas =" + numRuedas + "\nPotencia=" + potencia + "\nMatricula=" + matricula); 
	}
	
	
	

}
