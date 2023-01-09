/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer3;

/**
 * @author IvanSM
 *
 */
public class ProductoRefrigerado extends Productos {

	/**
	 * Atributos
	 */
	private String codigoSupervisionAlimentaria;
	
	///// Constructores /////
	public ProductoRefrigerado(String fechaCad, String numLote) {
		super(fechaCad, numLote);
		codigoSupervisionAlimentaria = "Desconocido";
	}

	public ProductoRefrigerado(String codigoSupervisionAlimentaria, String fechaCad, String numLote) {
		super(fechaCad, numLote);
		this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
	}
	
	///// Getters and Setters /////
	public String getCodigoSupervisionAlimentaria() {
		return codigoSupervisionAlimentaria;
	}

	public void setCodigoSupervisionAlimentaria(String codigoSupervisionAlimentaria) {
		this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
	}
	
	///// Metodos ///// 
	
	public String toString() {
		return "Productos Refrigerados \n----------------  \nCodigo organismo = " + codigoSupervisionAlimentaria +  "\nFecha de caducidad = " + super.getFechaCaducidad() + "\nNumero de Lote = " + super.getNumeroLote() ;
	} 


	
}
