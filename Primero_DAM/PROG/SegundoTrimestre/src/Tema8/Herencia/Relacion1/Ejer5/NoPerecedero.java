/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer5;

/**
 * @author IvanSM
 *
 */
public class NoPerecedero extends Productos{

	/**
	 * Atributos
	 */
	private String tipo;
	
	///// Constructores
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}
	
	///// Getters and Setters 
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	///// Metodos 
	// Multiplica el precio por la cantidad de productos pasados
	public double calcular(int cantidadProductos) {
		double totalProducto = getPrecio() * cantidadProductos;
		return totalProducto;
	}
		
	@Override
	public String toString() {
		return "NoPerecedero [tipo=" + tipo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
}
