/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer5;

/**
 * @author IvanSM
 *
 */
public class Productos {

	/**
	 * Atributos
	 */
	protected String nombre;
	protected double precio;

	///// Constructores /////
	// Por defecto
	public Productos() {
		super();
	}

	public Productos(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	///// Getters and Setters /////
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	///// Metodos /////
	// Multiplica el precio por la cantidad de productos pasados
	public double calcular(int cantidadProductos) {
		double totalProducto = getPrecio() * cantidadProductos;
		return totalProducto;
	}
}
