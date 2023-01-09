/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer3;

/**
 * @author IvanSM
 *
 */
public class ProductoCongelado extends Productos{

	/**
	 * Atributos
	 */
	private int temperaturaRecomendada;
	
	///// Constructores /////	
	public ProductoCongelado(String fechaCad, String numLote) {
		super(fechaCad, numLote);
	}

	public ProductoCongelado(int TemperaturaRecomendada,String fechaCad, String numLote) {
		super(fechaCad, numLote);
		this.temperaturaRecomendada = TemperaturaRecomendada;
	}

	///// Getters and Setters /////
	public int getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}

	public void setTemperaturaRecomendada(int TemperaturaRecomendada) {
		this.temperaturaRecomendada = TemperaturaRecomendada;
	}
	
	///// Metodos ///// 
	
	public String toString() {
		return "ProductoCongelado \n----------------- \nTemperatura Recomendada = " + temperaturaRecomendada + "\nFecha de caducidad = " +super.getFechaCaducidad() + "\nNumero de Lote = " + super.getNumeroLote();
	}
	
}
