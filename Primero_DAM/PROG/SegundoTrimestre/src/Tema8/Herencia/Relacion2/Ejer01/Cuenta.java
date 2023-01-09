/**
 * 
 */
package Tema8.Herencia.Relacion2.Ejer01;

/**
 * @author IvanSM
 *
 */
public class Cuenta {

	//Atributo
	protected float saldo;
	protected int numeroConsignaciones = 0;
	protected int numeroRetiros = 0;
	protected float tasaAnual;
	protected float comisionMensual;
	
	// Constructores
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}

	public Cuenta(float saldo, float tasaAnual) {
		super();
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}

	//Getters and Setters 
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConsignaciones() {
		return numeroConsignaciones;
	}

	public void setNumeroConsignaciones(int numeroConsignaciones) {
		this.numeroConsignaciones = numeroConsignaciones;
	}

	public int getNumeroRetiros() {
		return numeroRetiros;
	}

	public void setNumeroRetiros(int numeroRetiros) {
		this.numeroRetiros = numeroRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	//Metodos
	/**
	* Método que recibe una cantidad de dinero a consignar y actualiza
	* el saldo de la cuenta
	* @param saldo Parámetro que define la cantidad de dinero a
	* consignar en la cuenta
	*/
	public void consignar(float consignar) {
		this.saldo = this.saldo + consignar;
		numeroConsignaciones ++;
	}
	
	/**
	* Método que recibe una cantidad de dinero a retirar y actualiza el
	* saldo de la cuenta
	* @param saldo Parámetro que define la cantidad de dinero a retirar
	* de la cuenta
	*/
	public void retirar(float cantidad) {
		if(cantidad < this.saldo) {
			this.saldo = this.saldo - cantidad;
			numeroRetiros ++;
		}else {
			System.out.println("No dispones de saldo suficiente.");
		}
	}
	/**
	* Método que calcula interés mensual de la cuenta a partir de la tasa
	* anual aplicada
	*/
	public void calcularInteres() {
		float tasaMensual = this.tasaAnual / 12; //Convierte la tasa anual en mensual
		float interesMesual = this.saldo * tasaMensual;
		this.saldo = this.saldo + interesMesual;
	}
	
	/**
	* Método que genera un extracto aplicando al saldo actual una
	* comisión y calculando sus intereses
	*/
	public void extractoMensual() {
		this.saldo = this.saldo - comisionMensual;
		calcularInteres();
	}
	
	/*Formula
	 * TASA MENSUAL = (TASA ANUAL / 12)
	 * INTERES MENSUAL = SALDO * TASA MENSUAL
	 * SALDO = SALDO + INTERES MENSUAL
	 */
}
