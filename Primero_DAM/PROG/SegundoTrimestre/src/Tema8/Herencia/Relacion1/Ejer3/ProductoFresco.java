/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer3;

/**
 * @author IvanSM
 *
 */
public class ProductoFresco extends Productos {

	/**
	 * Atributos
	 */	
	private String fechaEnvasado;
	private String paisDeOrigen;
	
	///// Constructores /////	
	public ProductoFresco(String fechaCad, String numLote) {
		super(fechaCad, numLote);
		fechaEnvasado = "Desconocido";
		paisDeOrigen = "Desconocido";
	}

	public ProductoFresco(String fechaEnvasado, String paisDeOrigen, String fechaCad, String numLote) {
		super(fechaCad, numLote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisDeOrigen = paisDeOrigen;
		
	}
	
	///// Getters and Setters /////
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}
	
	///// Metodos ///// 
	public String toString() {
		return "Productos Frescos \n---------------- \nFecha de envasado = " + fechaEnvasado + "\nPais origen = " + paisDeOrigen + "\nFecha de caducidad = " +super.getFechaCaducidad() + "\nNumero de Lote = " + super.getNumeroLote();
	}
	
	

}
