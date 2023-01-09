package Examen.T8HerenciaInterfaces;


public class JuegoMesa extends Producto {

// ATRIBUTOS
	
	private MaterialJuego material;
	
// CONSTRUCTORES
	
	/**
	 * Constructor por defecto
	 */
	public JuegoMesa() {
		
	}
	
	/**
	 * Constructor por parametros
	 * @param nombre
	 * @param anno
	 * @param precioBase
	 * @param califEdades
	 * @param material
	 */
	public JuegoMesa(String nombre, int anno, double precioBase, int califEdades, MaterialJuego material) {
		super(nombre, anno, precioBase, califEdades);
		this.material = material;
	}
	
// GETTERS Y SETTERS
	
	public MaterialJuego getMaterial() {
		return material;
	}

	public void setMaterial(MaterialJuego material) {
		this.material = material;
	}
	
// METODOS
	
	/**
	 * Este metodo calcula y devuelve el precio que tendrá un juego de mesa.
	 * Teniendo en cuenta que el juego de mesa costará el precio base más el plus por el material principal.
	 * Además, si el producto es novedad (de 2020 o superior) valdrá 3 euros más.
	 * @return double precio
	 */
	public double calcularPrecio() {
		
		double precio = this.precioBase;
		
		double plus = material.getNumElementos() * material.getCosteUnitario();
		
		precio = precio + plus;
		
		if (this.anno >= 2020) { // Evalúa si el año de salida es igual o superior a 2020
			precio = precio + 3;
		}
		
		return precio;
	}

	/**
	 * Metodo toString
	 */
	public String toString() {
		return "Producto: " + getNombre() + ", Precio: " + calcularPrecio();
	}
	
	
}

