/**
 * 
 */
package Tema8.Herencia.Prueba;

/**
 * @author IvanSM
 *
 */
public class Moto extends Vehiculo2{

	/**
	 * Atributos
	 */
	
	private String marca;
	
	
	public Moto() {
		// TODO Auto-generated constructor stub
	}

	public Moto ( String marca) {
		super();
		this.marca = marca;
	}
	
	public Moto ( int numRuedas, int potencia, String matricula, String marca) {
		super(numRuedas, potencia, matricula);
		this.marca = marca;
	}
	
	///// Getter and Setters /////
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	///// Metodos /////
	public void marca () {
		System.out.println("Estas en la clase Coche2");
	}
	
	
	public void informacion3() {
		System.out.println("Moto \nMarca=" + marca); 
	}

	
	
}
