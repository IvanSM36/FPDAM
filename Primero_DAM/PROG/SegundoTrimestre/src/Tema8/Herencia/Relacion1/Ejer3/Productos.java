/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer3;

/**
 * @author IvanSM
 *
 */
public class Productos {

	/**
	 * Atributos 
	 */
	protected String fechaCaducidad;
	protected String numeroLote;
	
	
	///// Constructores /////
	
	public Productos() {
		fechaCaducidad= "Desconocido";
		numeroLote = "Desconocido";
	}
	
	public Productos(String fechaCaducidad, String numeroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}

	///// Getters and Setters /////
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}
	
	///// Metodos ///// 
	
	public String toString() {
		return "Productos \n----------- \nFecha de Caducidad = " + fechaCaducidad + "\nNumero de lote = " + numeroLote;
	}
	
	

	
}
