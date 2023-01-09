/**
 * 
 */
package Tema7POO.Relacion1;

/**
 * @author IvanSM
 *
 */
public class Cuenta {

	/**
	 * 
	 */
	private String titular;
	private double cantidad;

	// Constructor titular
	public Cuenta(String titular) {
		this(titular, 0);
	}

	// Constructor saldo
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	// Getters and Setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	// Metodos
	public void ingresar(double ingreso) {
		if (ingreso > 0) {
			System.out.println("Has ingresado " + ingreso);
			this.cantidad = this.cantidad + ingreso;
			System.out.println("Total en la cuenta: " + this.cantidad);
		} else {
			System.out.println("Total en la cuenta: " + this.cantidad);
		}		
	}
	
	public void retirar(double retirada) {
		if (this.cantidad - retirada < 0) {
			this.cantidad = 0;
			System.out.println("Total en la cuenta: " + this.cantidad);
		} else {
			System.out.println("Has retirado " + retirada);
			this.cantidad = this.cantidad - retirada;
			System.out.println("Total en la cuenta: " + this.cantidad);
			
		}		
	}

	@Override
	public String toString() {
		return "Cuenta \nTitular de la cuenta = " + titular + "\nSaldo disponible = " + cantidad;
	}

}
