package Examen.T8HerenciaInterfaces;

public abstract class Producto {

// ATRIBUTOS
	
	String nombre;
	int anno;
	double precioBase;
	int califEdades;
	
// CONSTRUCTORES
	
	/**
	 * Constructor por defecto
	 */
	public Producto() {
		this.nombre = "";
		this.anno = 0;
		this.precioBase = 0;
		this.califEdades = 0;
	}

	/**
	 * Constructor por parametros
	 * @param nombre
	 * @param anno
	 * @param precioBase
	 * @param califEdades
	 */
	public Producto(String nombre, int anno, double precioBase, int califEdades) {
		this.nombre = nombre;
		this.anno = anno;
		this.precioBase = precioBase;
		this.califEdades = califEdades;
	}
	
// GETTERS Y SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCalifEdades() {
		return califEdades;
	}

	public void setCalifEdades(int califEdades) {
		this.califEdades = califEdades;
	}
	
// METODOS
	
	/**
	 * Este metodo calcula el precio final del producto.
	 * @return double
	 */
	public abstract double calcularPrecio();
	
}
