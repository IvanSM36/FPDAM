/**
 * 
 */
package Tema7POO.Relacion2;

/**
 * @author IvanSM
 *
 */
public class CuentaBancaria {

	/**
	 * Atributos
	 */
	private String dni;
	private double saldoActual;
	private int interesAnual;
	
	///// Constructores /////
	public CuentaBancaria() {
		this.dni = "0";
		this.saldoActual = 0;
		this.interesAnual = 0;
	}

	public CuentaBancaria(String dni, double saldoActual, int interesAnual) {
		this.dni = dni;
		this.saldoActual = saldoActual;
		this.interesAnual = interesAnual;
	}
	
	///// Getters and Setters /////
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public int getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(int interesAnual) {
		this.interesAnual = interesAnual;
	}
	
	///// Metodos /////
	// Se le suma el interes.
	public void actualizarSaldo(int interesAnual) {
		this.saldoActual = this.saldoActual + ((interesAnual / 100) * this.saldoActual);
	}
	
	// Permitirá ingresar una cantidad en la cuenta.
	public void ingresar(double ingreso) {
		this.saldoActual = this.saldoActual + ingreso;
	}
	
	// Permitirá sacar una cantidad de la cuenta (si hay saldo)
	public void retirar(double retiro) {
		this.saldoActual = this.saldoActual - retiro;
	}
	
	// Imprimirá por pantalla todos los datos de la cuenta
	public void muestraInfo() {
		System.out.println("Datos de la cuenta con DNI " + this.dni);
		System.out.println("----------------------------------------");
		System.out.println("Saldo actual: " + this.saldoActual);
		System.out.println("Intereses anuales: " + this.interesAnual);
	}
	

}
